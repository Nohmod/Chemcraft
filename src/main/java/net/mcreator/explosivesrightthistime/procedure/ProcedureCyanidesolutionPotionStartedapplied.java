package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureCyanidesolutionPotionStartedapplied extends ElementsChemcraft.ModElement {
	public ProcedureCyanidesolutionPotionStartedapplied(ElementsChemcraft instance) {
		super(instance, 425);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CyanidesolutionPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("Timer", ((entity.getEntityData().getDouble("Timer")) + 1));
		if (((entity.getEntityData().getDouble("Timer")) > 200)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 600, (int) 1, (false), (false)));
		}
		if (((entity.getEntityData().getDouble("Timer")) > 300)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 400, (int) 2, (false), (false)));
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
		}
		if (((entity.getEntityData().getDouble("Timer")) > 500)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1000);
		}
	}
}
