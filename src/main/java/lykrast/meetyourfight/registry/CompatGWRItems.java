package lykrast.meetyourfight.registry;

import lykrast.meetyourfight.item.compat.*;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.IForgeRegistry;

public class CompatGWRItems {
	public static Item phantasmalRifle, cocktailShotgun;
	
	public static void registerItems(IForgeRegistry<Item> reg) {
		//Does not have the increased projectile speed of the sniper for more reliable hit through walls
		phantasmalRifle = ModItems.initItem(reg, 
				new PhantasmalRifle(ModItems.noStack().maxDamage(5276), 0, 2.5, 22, 0, 22)
				.fireSound(lykrast.gunswithoutroses.registry.ModSounds.sniper)
				.repair(() -> Ingredient.fromItems(ModItems.phantoplasm)), 
				"phantasmal_rifle");
		cocktailShotgun = ModItems.initItem(reg, 
				new CocktailShotgun(ModItems.noStack().maxDamage(8273), 0, 0.3, 16, 5, 14, 7).ignoreInvulnerability(true)
				.fireSound(lykrast.gunswithoutroses.registry.ModSounds.shotgun)
				.repair(() -> Ingredient.fromItems(ModItems.fortunesFavor)), 
				"cocktail_shotgun");
	}
}
