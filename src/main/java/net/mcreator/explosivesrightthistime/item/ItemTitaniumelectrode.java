
package net.mcreator.explosivesrightthistime.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.explosivesrightthistime.creativetab.TabGlassware;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ItemTitaniumelectrode extends ElementsChemcraft.ModElement {
	@GameRegistry.ObjectHolder("chemcraft:titaniumelectrode")
	public static final Item block = null;
	public ItemTitaniumelectrode(ElementsChemcraft instance) {
		super(instance, 195);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("chemcraft:titaniumelectrode", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(100900);
			maxStackSize = 1;
			setUnlocalizedName("titaniumelectrode");
			setRegistryName("titaniumelectrode");
			setCreativeTab(TabGlassware.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 10;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1.9000000000000001F;
		}
	}
}
