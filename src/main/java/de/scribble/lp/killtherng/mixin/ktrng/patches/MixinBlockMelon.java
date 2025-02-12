package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockMelon;

@Mixin(BlockMelon.class)
public class MixinBlockMelon {

	/**
	* null
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_458_1(Random rand, int i) {
		return KillTheRNG.randomness.random_458.nextInt(i);
//		KillTheRNG.randomness.random_458.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_459_2(Random rand, int i) {
		return KillTheRNG.randomness.random_459.nextInt(i);
//		KillTheRNG.randomness.random_459.nextInt(i);
//		return rand.nextInt(i);
	}

}
