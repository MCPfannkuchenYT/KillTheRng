package de.scribble.lp.killtherng.mixin.ktrng.patches;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleFallingDust;

@Mixin(ParticleFallingDust.class)
public class MixinParticleFallingDust {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_75_1() {
		return KillTheRNG.randomness.math_random_75.nextDouble();
//		KillTheRNG.randomness.math_random_75.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_76_2() {
		return KillTheRNG.randomness.math_random_76.nextDouble();
//		KillTheRNG.randomness.math_random_76.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_77_3() {
		return KillTheRNG.randomness.math_random_77.nextDouble();
//		KillTheRNG.randomness.math_random_77.nextDouble();
//		return Math.random();
	}

}
