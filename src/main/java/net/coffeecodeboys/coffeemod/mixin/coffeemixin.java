package net.coffeecodeboys.coffeemod.mixin;

import net.coffeecodeboys.coffeemod.*;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class coffeemixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		coffeemod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
