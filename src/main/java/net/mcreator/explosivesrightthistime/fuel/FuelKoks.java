
package net.mcreator.explosivesrightthistime.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.item.ItemCoke;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class FuelKoks extends ElementsChemcraft.ModElement {
	public FuelKoks(ElementsChemcraft instance) {
		super(instance, 108);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemCoke.block, (int) (1)).getItem())
			return 2000;
		return 0;
	}
}
