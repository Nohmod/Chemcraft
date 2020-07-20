
package net.mcreator.explosivesrightthistime.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.explosivesrightthistime.creativetab.TabExplosivesandchemicals;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class BlockAsphaltblock extends ElementsChemcraft.ModElement {
	@GameRegistry.ObjectHolder("chemcraft:asphaltblock")
	public static final Block block = null;
	public BlockAsphaltblock(ElementsChemcraft instance) {
		super(instance, 162);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("asphaltblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("chemcraft:asphaltblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("asphaltblock");
			setSoundType(SoundType.STONE);
			setHarvestLevel("shovel", 1);
			setHardness(0.8999999999999999F);
			setResistance(9F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabExplosivesandchemicals.tab);
			setBlockUnbreakable();
		}
	}
}
