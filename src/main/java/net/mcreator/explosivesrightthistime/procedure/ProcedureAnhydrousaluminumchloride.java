package net.mcreator.explosivesrightthistime.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.item.ItemAluminumhydroxide;
import net.mcreator.explosivesrightthistime.item.ItemAluminumchlorideanhydrous;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureAnhydrousaluminumchloride extends ElementsChemcraft.ModElement {
	public ProcedureAnhydrousaluminumchloride(ElementsChemcraft instance) {
		super(instance, 466);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Anhydrousaluminumchloride!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Anhydrousaluminumchloride!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Anhydrousaluminumchloride!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Anhydrousaluminumchloride!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Anhydrousaluminumchloride!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.isRaining())) {
			if ((Math.random() < 0.01)) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAluminumchlorideanhydrous.block, (int) (1)).getItem(), -1,
							(int) 1, null);
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemAluminumhydroxide.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("block.fire.extinguish")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			}
		}
	}
}
