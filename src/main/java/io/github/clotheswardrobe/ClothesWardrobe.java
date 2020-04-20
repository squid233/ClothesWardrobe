package io.github.clotheswardrobe;

import io.github.clotheswardrobe.clothes.ClothesRegister;
import net.fabricmc.api.ModInitializer;

public class ClothesWardrobe implements ModInitializer {
	public static final String MODID = "clotheswardrobe";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		new ClothesRegister();
		System.out.println("ClothesWardrobe is on initialize!");
	}
}
