package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;

@Mixin(StructureStrongholdPieces.Crossing.class)
public class MixinStructureStrongholdPieces$Crossing {

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeStronghold_1(Random rand) {
//		return KillTheRNG.randomness.posRotTypeStronghold.nextBoolean();
		KillTheRNG.randomness.posRotTypeStronghold.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_posRotTypeStronghold_2(Random rand) {
//		return KillTheRNG.randomness.posRotTypeStronghold.nextBoolean();
		KillTheRNG.randomness.posRotTypeStronghold.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_posRotTypeStronghold_3(Random rand) {
//		return KillTheRNG.randomness.posRotTypeStronghold.nextBoolean();
		KillTheRNG.randomness.posRotTypeStronghold.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeStronghold_4(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeStronghold.nextInt(i);
		KillTheRNG.randomness.posRotTypeStronghold.nextInt(i);
		return rand.nextInt(i);
	}

}
