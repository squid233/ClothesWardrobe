package io.github.clotheswardrobe.clothes;

import io.github.clotheswardrobe.ClothesWardrobe;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ClothesRegister {

    public static final Item GREEN_HAT = new ArmorItem(ClothesMaterials.GREEN, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroups.CW));
    public static final Item GREEN_SHIRT = new ArmorItem(ClothesMaterials.GREEN, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroups.CW));
    public static final Item GREEN_PANTS = new ArmorItem(ClothesMaterials.GREEN, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroups.CW));
    public static final Item GREEN_SHOES = new ArmorItem(ClothesMaterials.GREEN, EquipmentSlot.FEET, new Item.Settings().group(ItemGroups.CW));

    public ClothesRegister() {
        registerClothes("green_hat", GREEN_HAT, "green_shirt", GREEN_SHIRT, "green_pants", GREEN_PANTS, "green_shoes", GREEN_SHOES);
    }

    public void registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, new Identifier(ClothesWardrobe.MODID, itemName), item);
    }

    public void registerClothes(String item1Name, Item item1, String item2Name, Item item2, String item3Name, Item item3, String item4Name, Item item4) {
        Registry.register(Registry.ITEM, new Identifier(ClothesWardrobe.MODID, item1Name), item1);
        Registry.register(Registry.ITEM, new Identifier(ClothesWardrobe.MODID, item2Name), item2);
        Registry.register(Registry.ITEM, new Identifier(ClothesWardrobe.MODID, item3Name), item3);
        Registry.register(Registry.ITEM, new Identifier(ClothesWardrobe.MODID, item4Name), item4);
    }
}
