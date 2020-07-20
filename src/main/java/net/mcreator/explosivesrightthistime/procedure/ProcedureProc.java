package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureProc extends ElementsChemcraft.ModElement {
	public ProcedureProc(ElementsChemcraft instance) {
		super(instance, 160);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Proc!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Proc!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Proc!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Proc!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.isRaining())) {
			if ((world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))) {
				if ((Math.random() < 0.7)) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
					if ((Math.random() < 0.2)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						if (!world.isRemote) {
							world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, true);
						}
					}
				}
			}
		}
		if ((Blocks.FLOWING_WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
			if ((Math.random() < 0.4)) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				if (!world.isRemote) {
					world.createExplosion(null, (int) x, (int) y, (int) z, (float) 3, true);
				}
			}
		}
		if ((((Blocks.FLOWING_WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
				|| (Blocks.FLOWING_WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
						.getBlock()))
				|| ((Blocks.WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())
						|| (Blocks.WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
								.getBlock())))) {
			if ((Math.random() < 0.4)) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				if (!world.isRemote) {
					world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, true);
				}
			}
		}
		if ((((Blocks.FLOWING_WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
				|| (Blocks.FLOWING_WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
						.getBlock()))
				|| ((Blocks.WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())
						|| (Blocks.WATER.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
								.getBlock())))) {
			if ((Math.random() < 0.4)) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				if (!world.isRemote) {
					world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, true);
				}
			}
		}
	}
}
