package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.world.World;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureConfinedtatpEntityWalksOnTheBlock extends ElementsChemcraft.ModElement {
	public ProcedureConfinedtatpEntityWalksOnTheBlock(ElementsChemcraft instance) {
		super(instance, 346);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ConfinedtatpEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ConfinedtatpEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ConfinedtatpEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ConfinedtatpEntityWalksOnTheBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 0.4)) {
			if (!world.isRemote) {
				world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2.5, true);
			}
		}
	}
}
