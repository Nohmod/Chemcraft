package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.item.ItemSodiummetal;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureProc2 extends ElementsChemcraft.ModElement {
	public ProcedureProc2(ElementsChemcraft instance) {
		super(instance, 161);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Proc2!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Proc2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Proc2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Proc2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Proc2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.isRaining())) {
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
				if ((((((new ItemStack(ItemSodiummetal.block, (int) (1))
						.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem())
						|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemOffhand()
								: ItemStack.EMPTY).getItem()))
						|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())))
						|| (((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem()))
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemMainhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemOffhand()
												: ItemStack.EMPTY).getItem()))))
						|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())))) {
					if ((Math.random() < 0.001)) {
						if ((((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemMainhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem())))
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemMainhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem())))) {
							if (entity instanceof EntityPlayer)
								((EntityPlayer) entity).inventory.clearMatchingItems(
										((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getItem(),
										-1, (int) 1, null);
							if (!world.isRemote) {
								world.createExplosion(null, (int) x, (int) y, (int) z, (float) 0, true);
							}
							entity.attackEntityFrom(DamageSource.FIREWORKS, (float) 3);
						} else if ((((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemOffhand()
								: ItemStack.EMPTY).getItem())
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemOffhand()
												: ItemStack.EMPTY).getItem())))
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemOffhand()
												: ItemStack.EMPTY).getItem())))) {
							if (entity instanceof EntityPlayer)
								((EntityPlayer) entity).inventory.clearMatchingItems(
										((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem(),
										-1, (int) 1, null);
							if (!world.isRemote) {
								world.createExplosion(null, (int) x, (int) y, (int) z, (float) 0, true);
							}
							entity.attackEntityFrom(DamageSource.FIREWORKS, (float) 3);
						}
					}
				}
				if ((((((new ItemStack(ItemSodiummetal.block, (int) (1))
						.getItem() == ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem())
						|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemOffhand()
								: ItemStack.EMPTY).getItem()))
						|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())))
						|| (((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem()))
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemMainhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemOffhand()
												: ItemStack.EMPTY).getItem()))))
						|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())))) {
					if ((Math.random() < 0.0008)) {
						if ((((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemMainhand()
								: ItemStack.EMPTY).getItem())
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemMainhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem())))
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemMainhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY).getItem())))) {
							if (entity instanceof EntityPlayer)
								((EntityPlayer) entity).inventory.clearMatchingItems(
										((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getItem(),
										-1, (int) 1, null);
							if (!world.isRemote) {
								world.createExplosion(null, (int) x, (int) y, (int) z, (float) 1, true);
							}
							entity.attackEntityFrom(DamageSource.FIREWORKS, (float) 4);
						} else if ((((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
								? ((EntityLivingBase) entity).getHeldItemOffhand()
								: ItemStack.EMPTY).getItem())
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemOffhand()
												: ItemStack.EMPTY).getItem())))
								|| ((new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
										? ((EntityLivingBase) entity).getHeldItemOffhand()
										: ItemStack.EMPTY).getItem())
										|| (new ItemStack(ItemSodiummetal.block, (int) (1)).getItem() == ((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemOffhand()
												: ItemStack.EMPTY).getItem())))) {
							if (entity instanceof EntityPlayer)
								((EntityPlayer) entity).inventory.clearMatchingItems(
										((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
												.getItem(),
										-1, (int) 1, null);
							if (!world.isRemote) {
								world.createExplosion(null, (int) x, (int) y, (int) z, (float) 1, true);
							}
							entity.attackEntityFrom(DamageSource.FIREWORKS, (float) 4);
						}
					}
				}
			}
		}
	}
}
