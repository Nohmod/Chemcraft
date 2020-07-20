
package net.mcreator.explosivesrightthistime.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.item.ItemSalicilicacid;
import net.mcreator.explosivesrightthistime.item.ItemPhenol;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class RecipePhenol2 extends ElementsChemcraft.ModElement {
	public RecipePhenol2(ElementsChemcraft instance) {
		super(instance, 20);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSalicilicacid.block, (int) (1)), new ItemStack(ItemPhenol.block, (int) (1)), 1F);
	}
}
