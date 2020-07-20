package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.world.World;
import net.minecraft.client.gui.GuiTextField;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.HashMap;

@ElementsChemcraft.ModElement.Tag
public class ProcedureElectrofurnuaceprocedure2 extends ElementsChemcraft.ModElement {
	public ProcedureElectrofurnuaceprocedure2(ElementsChemcraft instance) {
		super(instance, 278);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Electrofurnuaceprocedure2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Electrofurnuaceprocedure2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Electrofurnuaceprocedure2!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure Electrofurnuaceprocedure2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Electrofurnuaceprocedure2!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		World world = (World) dependencies.get("world");
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:Temperature");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("1000"))) {
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureElectrofurnuaceprocedure.executeProcedure($_dependencies);
			}
		}
	}
}
