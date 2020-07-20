
package net.mcreator.explosivesrightthistime.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.item.ItemH2s04;
import net.mcreator.explosivesrightthistime.item.ItemDilutesulfuricacid;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class RecipeConc extends ElementsChemcraft.ModElement {
	public RecipeConc(ElementsChemcraft instance) {
		super(instance, 41);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemDilutesulfuricacid.block, (int) (1)), new ItemStack(ItemH2s04.block, (int) (1)), 1F);
	}
}
