
package net.mcreator.explosivesrightthistime.potion;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.Minecraft;

import net.mcreator.explosivesrightthistime.item.ItemCyanideantidote2;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.List;
import java.util.ArrayList;

@ElementsChemcraft.ModElement.Tag
public class PotionCyanidesolution extends ElementsChemcraft.ModElement {
	@GameRegistry.ObjectHolder("chemcraft:cyanidesolution")
	public static final Potion potion = null;
	@GameRegistry.ObjectHolder("chemcraft:cyanidesolution")
	public static final PotionType potionType = null;
	public PotionCyanidesolution(ElementsChemcraft instance) {
		super(instance, 424);
	}

	@Override
	public void initElements() {
		elements.potions.add(() -> new PotionCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		ForgeRegistries.POTION_TYPES.register(new PotionTypeCustom());
	}
	public static class PotionTypeCustom extends PotionType {
		public PotionTypeCustom() {
			super(new PotionEffect[]{new PotionEffect(potion, 3600)});
			setRegistryName("cyanidesolution");
		}
	}

	public static class PotionCustom extends Potion {
		private final ResourceLocation potionIcon;
		public PotionCustom() {
			super(true, -1);
			setRegistryName("cyanidesolution");
			setPotionName("effect.cyanidesolution");
			potionIcon = new ResourceLocation("chemcraft:textures/mob_effect/cyanidesolution.png");
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public List<ItemStack> getCurativeItems() {
			List<ItemStack> ret = new ArrayList<>();
			ret.add(new ItemStack(ItemCyanideantidote2.block, (int) (1)));
			return ret;
		}

		@Override
		public boolean shouldRenderInvText(PotionEffect effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(PotionEffect effect) {
			return true;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
			if (mc.currentScreen != null) {
				mc.getTextureManager().bindTexture(potionIcon);
				Gui.drawModalRectWithCustomSizedTexture(x + 6, y + 7, 0, 0, 18, 18, 18, 18);
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
			mc.getTextureManager().bindTexture(potionIcon);
			Gui.drawModalRectWithCustomSizedTexture(x + 3, y + 3, 0, 0, 18, 18, 18, 18);
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
