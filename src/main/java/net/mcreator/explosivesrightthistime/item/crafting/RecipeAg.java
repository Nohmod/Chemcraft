
package net.mcreator.explosivesrightthistime.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.item.ItemSilver;
import net.mcreator.explosivesrightthistime.block.BlockSilverore;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class RecipeAg extends ElementsChemcraft.ModElement {
	public RecipeAg(ElementsChemcraft instance) {
		super(instance, 80);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSilverore.block, (int) (1)), new ItemStack(ItemSilver.block, (int) (1)), 1F);
	}
}
