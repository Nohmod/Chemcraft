
package net.mcreator.explosivesrightthistime.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.explosivesrightthistime.item.ItemCoppernitrate;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class TabInorganic extends ElementsChemcraft.ModElement {
	public TabInorganic(ElementsChemcraft instance) {
		super(instance, 204);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabinorganic") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCoppernitrate.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
