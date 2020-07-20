
package net.mcreator.explosivesrightthistime.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.item.ItemLead;
import net.mcreator.explosivesrightthistime.block.BlockGalena;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class RecipeLead3 extends ElementsChemcraft.ModElement {
	public RecipeLead3(ElementsChemcraft instance) {
		super(instance, 45);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockGalena.block, (int) (1)), new ItemStack(ItemLead.block, (int) (1)), 1F);
	}
}
