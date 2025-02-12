package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;

@Mixin(WorldGenHugeTrees.class)
public class MixinWorldGenHugeTrees {

	/**
	* Height of a huge tree
	*/
	@Redirect(method = "getHeight(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genHugeTreeHeight_1(Random rand, int i) {
//		return KillTheRNG.randomness.genHugeTreeHeight.nextInt(i);
		KillTheRNG.randomness.genHugeTreeHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Extra height of a huge tree
	*/
	@Redirect(method = "getHeight(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genHugeTreeExtraHeight_2(Random rand, int i) {
//		return KillTheRNG.randomness.genHugeTreeExtraHeight.nextInt(i);
		KillTheRNG.randomness.genHugeTreeExtraHeight.nextInt(i);
		return rand.nextInt(i);
	}

}
