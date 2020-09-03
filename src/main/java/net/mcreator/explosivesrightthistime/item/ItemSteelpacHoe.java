
package net.mcreator.explosivesrightthistime.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.Set;
import java.util.HashMap;

@ElementsChemcraft.ModElement.Tag
public class ItemSteelpacHoe extends ElementsChemcraft.ModElement {
	@GameRegistry.ObjectHolder("chemcraft:steelpachoe")
	public static final Item block = null;
	public ItemSteelpacHoe(ElementsChemcraft instance) {
		super(instance, 362);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("STEELPACHOE", 3, 441, 8f, 0f, 21)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("steelpachoe").setRegistryName("steelpachoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chemcraft:steelpachoe", "inventory"));
	}
}
