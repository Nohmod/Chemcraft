
package net.mcreator.explosivesrightthistime.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.block.BlockCokeblock;
import net.mcreator.explosivesrightthistime.block.BlockBitominouscoalblock;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class RecipeCoke1 extends ElementsChemcraft.ModElement {
	public RecipeCoke1(ElementsChemcraft instance) {
		super(instance, 485);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBitominouscoalblock.block, (int) (1)), new ItemStack(BlockCokeblock.block, (int) (1)), 1F);
	}
}
