
package net.mcreator.explosivesrightthistime.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.explosivesrightthistime.item.ItemCalc;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class TabMinerals extends ElementsChemcraft.ModElement {
	public TabMinerals(ElementsChemcraft instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabminerals") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCalc.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
