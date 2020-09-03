
package net.mcreator.explosivesrightthistime.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.Set;
import java.util.HashMap;

@ElementsChemcraft.ModElement.Tag
public class ItemSteelpacPickaxe extends ElementsChemcraft.ModElement {
	@GameRegistry.ObjectHolder("chemcraft:steelpacpickaxe")
	public static final Item block = null;
	public ItemSteelpacPickaxe(ElementsChemcraft instance) {
		super(instance, 358);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("STEELPACPICKAXE", 3, 700, 8f, -1f, 21)) {
			{
				this.attackSpeed = -1f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("steelpacpickaxe").setRegistryName("steelpacpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chemcraft:steelpacpickaxe", "inventory"));
	}
}
