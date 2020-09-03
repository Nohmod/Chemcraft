
package net.mcreator.explosivesrightthistime.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.Set;
import java.util.HashMap;

@ElementsChemcraft.ModElement.Tag
public class ItemSteelpacShovel extends ElementsChemcraft.ModElement {
	@GameRegistry.ObjectHolder("chemcraft:steelpacshovel")
	public static final Item block = null;
	public ItemSteelpacShovel(ElementsChemcraft instance) {
		super(instance, 361);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("STEELPACSHOVEL", 3, 441, 8f, -1f, 21)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("steelpacshovel").setRegistryName("steelpacshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chemcraft:steelpacshovel", "inventory"));
	}
}
