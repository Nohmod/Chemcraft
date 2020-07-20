
package net.mcreator.explosivesrightthistime.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.explosivesrightthistime.block.BlockFurnuaceOn;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class TabMachines extends ElementsChemcraft.ModElement {
	public TabMachines(ElementsChemcraft instance) {
		super(instance, 178);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmachines") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockFurnuaceOn.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
