package net.mcreator.explosivesrightthistime.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.item.ItemCalciumchloride;
import net.mcreator.explosivesrightthistime.item.ItemAnhydrouscalciumchloride;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureAnhydrouscalciumchlorideItemInHandTick extends ElementsChemcraft.ModElement {
	public ProcedureAnhydrouscalciumchlorideItemInHandTick(ElementsChemcraft instance) {
		super(instance, 384);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AnhydrouscalciumchlorideItemInHandTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AnhydrouscalciumchlorideItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((world.isRaining())) {
			if ((Math.random() < 0.01)) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAnhydrouscalciumchloride.block, (int) (1)).getItem(), -1,
							(int) 1, null);
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemCalciumchloride.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
			}
		}
	}
}
