package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.item.ItemMercurynitrate;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureMercurynitrateItemInHandTick extends ElementsChemcraft.ModElement {
	public ProcedureMercurynitrateItemInHandTick(ElementsChemcraft instance) {
		super(instance, 357);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MercurynitrateItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemMercurynitrate.block, (int) (1)).getItem())) {
			if ((Math.random() < 0.5)) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
			}
			if ((Math.random() < 0.2)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 60, (int) 1));
			}
		}
	}
}
