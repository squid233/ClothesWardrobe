package io.github.clotheswardrobe.clothes;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ClothesMaterials implements ArmorMaterial {

    GREEN("green", Integer.MAX_VALUE, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5f, () -> {
        return Ingredient.fromTag(ItemTags.LOGS);
    });

    private final int[] clothesValue = {3, 3, 3, 3};
    private static final int[] baseDurability = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredient;

    ClothesMaterials(String name, int durabilityMultiplier, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.toughness = toughness;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return baseDurability[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.clothesValue[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
