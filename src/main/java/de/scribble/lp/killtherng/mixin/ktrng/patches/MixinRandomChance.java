package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.storage.loot.conditions.RandomChance;

@Mixin(RandomChance.class)
public class MixinRandomChance {

	/**
	* Test Random chance condition
	*/
	@Redirect(method = "testCondition(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_randomChanceTestCondition_1(Random rand) {
		return KillTheRNG.randomness.randomChanceTestCondition.nextFloat();
//		KillTheRNG.randomness.randomChanceTestCondition.nextFloat();
//		return rand.nextFloat();
	}

}
