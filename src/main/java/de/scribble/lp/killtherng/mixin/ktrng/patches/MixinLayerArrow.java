package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.entity.layers.LayerArrow;

@Mixin(LayerArrow.class)
public class MixinLayerArrow {

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1408_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1408.nextInt(i);
//		KillTheRNG.randomness.random_1408.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1409_2(Random rand) {
		return KillTheRNG.randomness.random_1409.nextFloat();
//		KillTheRNG.randomness.random_1409.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1410_3(Random rand) {
		return KillTheRNG.randomness.random_1410.nextFloat();
//		KillTheRNG.randomness.random_1410.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1411_4(Random rand) {
		return KillTheRNG.randomness.random_1411.nextFloat();
//		KillTheRNG.randomness.random_1411.nextFloat();
//		return rand.nextFloat();
	}

}
