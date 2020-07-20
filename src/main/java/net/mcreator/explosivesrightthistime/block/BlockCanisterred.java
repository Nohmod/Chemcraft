
package net.mcreator.explosivesrightthistime.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.explosivesrightthistime.creativetab.TabInorganic;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.List;

@ElementsChemcraft.ModElement.Tag
public class BlockCanisterred extends ElementsChemcraft.ModElement {
	@GameRegistry.ObjectHolder("chemcraft:canisterred")
	public static final Block block = null;
	public BlockCanisterred(ElementsChemcraft instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("canisterred"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("chemcraft:canisterred", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("canisterred");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(18F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabInorganic.tab);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Explosive pressurised gas");
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
