package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.effect.EntityLightningBolt;

@Mixin(EntityLightningBolt.class)
public class MixinEntityLightningBolt {

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_lightningBoltVertex_1(Random rand) {
		return KillTheRNG.randomness.lightningBoltVertex.nextLong();
//		KillTheRNG.randomness.lightningBoltVertex.nextLong();
//		return rand.nextLong();
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningBoltVertex_2(Random rand, int i) {
		return KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_lightningBoltVertex_3(Random rand, int i) {
		return KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_lightningBoltVertex_4(Random rand, int i) {
		return KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_lightningBoltVertex_5(Random rand, int i) {
		return KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		KillTheRNG.randomness.lightningBoltVertex.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_lightningBoltSound_6(Random rand) {
		return KillTheRNG.randomness.lightningBoltSound.nextFloat();
//		KillTheRNG.randomness.lightningBoltSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_lightningBoltSound_7(Random rand) {
		return KillTheRNG.randomness.lightningBoltSound.nextFloat();
//		KillTheRNG.randomness.lightningBoltSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningBoltSound_8(Random rand, int i) {
		return KillTheRNG.randomness.lightningBoltSound.nextInt(i);
//		KillTheRNG.randomness.lightningBoltSound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_lightningBoltSound_9(Random rand) {
		return KillTheRNG.randomness.lightningBoltSound.nextLong();
//		KillTheRNG.randomness.lightningBoltSound.nextLong();
//		return rand.nextLong();
	}

}
