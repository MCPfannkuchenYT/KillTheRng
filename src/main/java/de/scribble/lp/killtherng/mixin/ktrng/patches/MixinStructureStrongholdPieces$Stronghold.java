package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;

@Mixin(StructureStrongholdPieces.Stronghold.class)
public class MixinStructureStrongholdPieces$Stronghold {

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "getRandomDoor(Ljava/util/Random;)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$Door;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeStronghold_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeStronghold.nextInt(i);
		KillTheRNG.randomness.posRotTypeStronghold.nextInt(i);
		return rand.nextInt(i);
	}

}
