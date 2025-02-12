package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureVillagePieces;

@Mixin(StructureVillagePieces.WoodHut.class)
public class MixinStructureVillagePieces$WoodHut {

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeVillage_1(Random rand) {
//		return KillTheRNG.randomness.posRotTypeVillage.nextBoolean();
		KillTheRNG.randomness.posRotTypeVillage.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeVillage_2(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeVillage.nextInt(i);
		KillTheRNG.randomness.posRotTypeVillage.nextInt(i);
		return rand.nextInt(i);
	}

}
