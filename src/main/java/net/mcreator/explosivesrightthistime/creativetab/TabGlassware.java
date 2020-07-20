
package net.mcreator.explosivesrightthistime.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.explosivesrightthistime.item.ItemEnylnmayerflask;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class TabGlassware extends ElementsChemcraft.ModElement {
	public TabGlassware(ElementsChemcraft instance) {
		super(instance, 209);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabglassware") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemEnylnmayerflask.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
