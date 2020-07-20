
package net.mcreator.explosivesrightthistime.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.item.ItemSodiumcarbonate;
import net.mcreator.explosivesrightthistime.item.ItemNaperoxide;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class RecipePerox extends ElementsChemcraft.ModElement {
	public RecipePerox(ElementsChemcraft instance) {
		super(instance, 67);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSodiumcarbonate.block, (int) (1)), new ItemStack(ItemNaperoxide.block, (int) (1)), 1F);
	}
}
