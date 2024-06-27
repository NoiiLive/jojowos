
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.potion.TimestopCounterMobEffect;
import net.mcreator.jojowos.potion.TimeStoppedMobEffect;
import net.mcreator.jojowos.potion.TimeStopVisualMobEffect;
import net.mcreator.jojowos.potion.StoppedTimeMobEffect;
import net.mcreator.jojowos.potion.StandJumpEffectMobEffect;
import net.mcreator.jojowos.potion.SandTrappedMobEffect;
import net.mcreator.jojowos.potion.RedBindedMobEffect;
import net.mcreator.jojowos.potion.NoArmorChariotMobEffect;
import net.mcreator.jojowos.potion.GrapplingMobEffect;
import net.mcreator.jojowos.potion.BurrowedEffectMobEffect;
import net.mcreator.jojowos.JojowosMod;

public class JojowosModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, JojowosMod.MODID);
	public static final RegistryObject<MobEffect> STAND_JUMP_EFFECT = REGISTRY.register("stand_jump_effect", () -> new StandJumpEffectMobEffect());
	public static final RegistryObject<MobEffect> TIME_STOPPED = REGISTRY.register("time_stopped", () -> new TimeStoppedMobEffect());
	public static final RegistryObject<MobEffect> BURROWED_EFFECT = REGISTRY.register("burrowed_effect", () -> new BurrowedEffectMobEffect());
	public static final RegistryObject<MobEffect> STOPPED_TIME = REGISTRY.register("stopped_time", () -> new StoppedTimeMobEffect());
	public static final RegistryObject<MobEffect> SAND_TRAPPED = REGISTRY.register("sand_trapped", () -> new SandTrappedMobEffect());
	public static final RegistryObject<MobEffect> NO_ARMOR_CHARIOT = REGISTRY.register("no_armor_chariot", () -> new NoArmorChariotMobEffect());
	public static final RegistryObject<MobEffect> RED_BINDED = REGISTRY.register("red_binded", () -> new RedBindedMobEffect());
	public static final RegistryObject<MobEffect> TIME_STOP_VISUAL = REGISTRY.register("time_stop_visual", () -> new TimeStopVisualMobEffect());
	public static final RegistryObject<MobEffect> TIMESTOP_COUNTER = REGISTRY.register("timestop_counter", () -> new TimestopCounterMobEffect());
	public static final RegistryObject<MobEffect> GRAPPLING = REGISTRY.register("grappling", () -> new GrapplingMobEffect());
}
