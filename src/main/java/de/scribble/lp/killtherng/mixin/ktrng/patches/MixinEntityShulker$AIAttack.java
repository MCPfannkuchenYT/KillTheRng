package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntityShulker$AIAttack")
public class MixinEntityShulker$AIAttack {

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_941_1(Random rand, int i) {
		return KillTheRNG.randomness.random_941.nextInt(i);
//		KillTheRNG.randomness.random_941.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_942_2(Random rand) {
		return KillTheRNG.randomness.random_942.nextFloat();
//		KillTheRNG.randomness.random_942.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_943_3(Random rand) {
		return KillTheRNG.randomness.random_943.nextFloat();
//		KillTheRNG.randomness.random_943.nextFloat();
//		return rand.nextFloat();
	}

}
