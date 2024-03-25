
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

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
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

import net.mcreator.jojowos.procedures.NoAttackTimestopProcedure;
import net.mcreator.jojowos.procedures.NPCTickGoodKarmaProcedure;
import net.mcreator.jojowos.procedures.NPCSpawnProcedure;
import net.mcreator.jojowos.procedures.EntityNoCavesProcedure;
import net.mcreator.jojowos.procedures.AvdolOpenChatboxProcedure;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.init.JojowosModEntities;

import javax.annotation.Nullable;

public class MuhammedAvdolEntity extends Monster implements GeoEntity {
	public static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(MuhammedAvdolEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(MuhammedAvdolEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(MuhammedAvdolEntity.class, EntityDataSerializers.STRING);
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	private boolean swinging;
	private boolean lastloop;
	private long lastSwing;
	public String animationprocedure = "empty";

	public MuhammedAvdolEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(JojowosModEntities.MUHAMMED_AVDOL.get(), world);
	}

	public MuhammedAvdolEntity(EntityType<MuhammedAvdolEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(JojowosModItems.AVDOL_CLOTHES_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojowosModItems.AVDOL_CLOTHES_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(JojowosModItems.AVDOL_CLOTHES_LEGGINGS.get()));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(JojowosModItems.AVDOL_CLOTHES_BOOTS.get()));
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(SHOOT, false);
		this.entityData.define(ANIMATION, "undefined");
		this.entityData.define(TEXTURE, "mohammedavdoltexture");
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
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}

		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(4, new OpenDoorGoal(this, true));
		this.goalSelector.addGoal(5, new OpenDoorGoal(this, false));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, DIOEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, DIOAwakenedEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
				return super.canContinueToUse() && NoAttackTimestopProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, DIOCapedEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
				return super.canUse() && NoAttackTimestopProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = MuhammedAvdolEntity.this.getX();
				double y = MuhammedAvdolEntity.this.getY();
				double z = MuhammedAvdolEntity.this.getZ();
				Entity entity = MuhammedAvdolEntity.this;
				Level world = MuhammedAvdolEntity.this.level();
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.is(DamageTypes.IN_FIRE))
			return false;
		return super.hurt(source, amount);
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

		AvdolOpenChatboxProcedure.execute(world, x, y, z, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		NPCTickGoodKarmaProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
		this.refreshDimensions();
	}

	@Override
	public EntityDimensions getDimensions(Pose p_33597_) {
		return super.getDimensions(p_33597_).scale((float) 1);
	}

	public static void init() {
		SpawnPlacements.register(JojowosModEntities.MUHAMMED_AVDOL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return EntityNoCavesProcedure.execute(world, x, y, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 150);
		builder = builder.add(Attributes.ARMOR, 20);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
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
			this.remove(MuhammedAvdolEntity.RemovalReason.KILLED);
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
