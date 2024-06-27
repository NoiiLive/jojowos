
package net.mcreator.jojowos.entity;

import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.GeoEntity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RestrictSunGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.jojowos.procedures.Part3NPCDeathProcedure;
import net.mcreator.jojowos.procedures.NoAttackTimestopProcedure;
import net.mcreator.jojowos.procedures.NPCTickBadKarmaProcedure;
import net.mcreator.jojowos.procedures.NPCSpawnProcedure;
import net.mcreator.jojowos.procedures.DioOpenChatboxProcedure;
import net.mcreator.jojowos.init.JojowosModEntities;

import javax.annotation.Nullable;

public class DIOAwakenedEntity extends Monster implements GeoEntity {
	public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(DIOAwakenedEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(DIOAwakenedEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(DIOAwakenedEntity.class, EntityDataSerializers.STRING);
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private boolean swinging;
	private boolean lastloop;
	private long lastSwing;
	public String animationprocedure = "empty";

	public DIOAwakenedEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(JojowosModEntities.DIO_AWAKENED.get(), world);
	}

	public DIOAwakenedEntity(EntityType<DIOAwakenedEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setMaxUpStep(0.6f);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SHOOT, false);
		this.entityData.define(ANIMATION, "undefined");
		this.entityData.define(TEXTURE, "dioshirtlesstexture");
	}

	public void setTexture(String texture) {
		this.entityData.set(TEXTURE, texture);
	}

	public String getTexture() {
		return this.entityData.get(TEXTURE);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.3, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return 4;
			}

			@Override
			public boolean canUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}

		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(4, new RestrictSunGoal(this));
		this.goalSelector.addGoal(5, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(6, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(7, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, JotaroKujoPart3Entity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, JeanPierrePolnareffEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, OldJosephJoestarEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, IggyEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, NoriakiKakyoinEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = DIOAwakenedEntity.this.getX();
				double y = DIOAwakenedEntity.this.getY();
				double z = DIOAwakenedEntity.this.getZ();
				Entity entity = DIOAwakenedEntity.this;
				Level world = DIOAwakenedEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		Part3NPCDeathProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		NPCSpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putString("Texture", this.getTexture());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Texture"))
			this.setTexture(compound.getString("Texture"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level();

		DioOpenChatboxProcedure.execute(world, x, y, z, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		NPCTickBadKarmaProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
		this.refreshDimensions();
	}

	@Override
	public EntityDimensions getDimensions(Pose p_33597_) {
		return super.getDimensions(p_33597_).scale((float) 1);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 150);
		builder = builder.add(Attributes.ARMOR, 20);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
		return builder;
	}

	private PlayState movementPredicate(AnimationState event) {
		if (this.animationprocedure.equals("empty")) {
			if ((event.isMoving() || !(event.getLimbSwingAmount() > -0.15F && event.getLimbSwingAmount() < 0.15F))

					&& !this.isAggressive()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("walking"));
			}
			if (this.isSprinting()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("running"));
			}
			if (this.isAggressive() && event.isMoving()) {
				return event.setAndContinue(RawAnimation.begin().thenLoop("aggressive"));
			}
			return event.setAndContinue(RawAnimation.begin().thenLoop("idle"));
		}
		return PlayState.STOP;
	}

	private PlayState procedurePredicate(AnimationState event) {
		if (!animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED) {
			event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
			if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
				this.animationprocedure = "empty";
				event.getController().forceAnimationReset();
			}
		} else if (animationprocedure.equals("empty")) {
			return PlayState.STOP;
		}
		return PlayState.CONTINUE;
	}

	@Override
	protected void tickDeath() {
		++this.deathTime;
		if (this.deathTime == 20) {
			this.remove(DIOAwakenedEntity.RemovalReason.KILLED);
			this.dropExperience();
		}
	}

	public String getSyncedAnimation() {
		return this.entityData.get(ANIMATION);
	}

	public void setAnimation(String animation) {
		this.entityData.set(ANIMATION, animation);
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar data) {
		data.add(new AnimationController<>(this, "movement", 4, this::movementPredicate));
		data.add(new AnimationController<>(this, "procedure", 4, this::procedurePredicate));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}
