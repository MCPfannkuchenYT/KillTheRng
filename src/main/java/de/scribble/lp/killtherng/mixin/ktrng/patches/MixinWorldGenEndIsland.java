package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenEndIsland;

@Mixin(WorldGenEndIsland.class)
public class MixinWorldGenEndIsland {

	/**
	* End Island Pos
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endIslandPos_1(Random rand, int i) {
//		return KillTheRNG.randomness.endIslandPos.nextInt(i);
		KillTheRNG.randomness.endIslandPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* End Island Pos
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_endIslandPos_2(Random rand, int i) {
//		return KillTheRNG.randomness.endIslandPos.nextInt(i);
		KillTheRNG.randomness.endIslandPos.nextInt(i);
		return rand.nextInt(i);
	}

}
