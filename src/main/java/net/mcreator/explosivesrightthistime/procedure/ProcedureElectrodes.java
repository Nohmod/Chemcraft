package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

@ElementsChemcraft.ModElement.Tag
public class ProcedureElectrodes extends ElementsChemcraft.ModElement {
	public ProcedureElectrodes(ElementsChemcraft instance) {
		super(instance, 280);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Electrodes!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0))) > 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (6))) == 1))) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack stack = ((Slot) ((Map) invobj).get((int) (4))).getStack();
						if (stack != null) {
							if (stack.attemptDamageItem((int) 1, new Random(), null)) {
								stack.shrink(1);
								stack.setItemDamage(0);
							}
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack stack = ((Slot) ((Map) invobj).get((int) (6))).getStack();
						if (stack != null) {
							if (stack.attemptDamageItem((int) 1, new Random(), null)) {
								stack.shrink(1);
								stack.setItemDamage(0);
							}
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
