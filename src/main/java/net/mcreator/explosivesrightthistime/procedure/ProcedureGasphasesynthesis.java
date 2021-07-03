package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.item.ItemSodiummetal;
import net.mcreator.explosivesrightthistime.item.ItemSodiumhydroxidesolution;
import net.mcreator.explosivesrightthistime.item.ItemSodiumamide;
import net.mcreator.explosivesrightthistime.item.ItemSludge;
import net.mcreator.explosivesrightthistime.item.ItemNaN3;
import net.mcreator.explosivesrightthistime.item.ItemMethanol;
import net.mcreator.explosivesrightthistime.item.ItemMetaloxides;
import net.mcreator.explosivesrightthistime.item.ItemLeadpowdertechnicalgrade;
import net.mcreator.explosivesrightthistime.item.ItemLeadpowderpure;
import net.mcreator.explosivesrightthistime.item.ItemLeadpowderimpure;
import net.mcreator.explosivesrightthistime.item.ItemLeadoxideIIpure;
import net.mcreator.explosivesrightthistime.item.ItemLeadIIoxidetechnicalgrade;
import net.mcreator.explosivesrightthistime.item.ItemLeadIIoxide;
import net.mcreator.explosivesrightthistime.item.ItemHydrofluoricacid;
import net.mcreator.explosivesrightthistime.item.ItemHydrochloricacid;
import net.mcreator.explosivesrightthistime.item.ItemHno3;
import net.mcreator.explosivesrightthistime.item.ItemDisstiledwater;
import net.mcreator.explosivesrightthistime.item.ItemCopperpowderimpure;
import net.mcreator.explosivesrightthistime.item.ItemChlorinatedanodemud;
import net.mcreator.explosivesrightthistime.item.ItemBleach;
import net.mcreator.explosivesrightthistime.item.ItemAmmoniasolution;
import net.mcreator.explosivesrightthistime.item.ItemAluminumnugget;
import net.mcreator.explosivesrightthistime.item.ItemAluminumchlorideanhydrous;
import net.mcreator.explosivesrightthistime.block.BlockNitrousoxidegascylinder;
import net.mcreator.explosivesrightthistime.block.BlockNitrogendioxidecylinder;
import net.mcreator.explosivesrightthistime.block.BlockHydrogenchloridecylinder;
import net.mcreator.explosivesrightthistime.block.BlockHydrogenFluoride;
import net.mcreator.explosivesrightthistime.block.BlockEmptygascylinder2;
import net.mcreator.explosivesrightthistime.block.BlockChlorinecylinder;
import net.mcreator.explosivesrightthistime.block.BlockCarbonmonoxide;
import net.mcreator.explosivesrightthistime.block.BlockCanisterred;
import net.mcreator.explosivesrightthistime.block.BlockAmmoniacylinder;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.function.Supplier;
import java.util.Map;

@ElementsChemcraft.ModElement.Tag
public class ProcedureGasphasesynthesis extends ElementsChemcraft.ModElement {
	public ProcedureGasphasesynthesis(ElementsChemcraft instance) {
		super(instance, 182);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Gasphasesynthesis!");
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
		}.getAmount((int) (0))) > 0) && ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCarbonmonoxide.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(BlockCanisterred.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockAmmoniacylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockNitrogendioxidecylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSodiumhydroxidesolution.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCarbonmonoxide.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemLeadIIoxide.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockHydrogenFluoride.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCarbonmonoxide.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemLeadIIoxidetechnicalgrade.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSludge.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockAmmoniacylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSodiummetal.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockNitrousoxidegascylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSodiumamide.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemAluminumnugget.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(BlockCanisterred.block, (int) (1)).getItem())) || ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockHydrogenchloridecylinder.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem())) || (((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCanisterred.block, (int) (1)).getItem()) && ((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(ItemMetaloxides.block, (int) (1)).getItem()))))))))))))))))) {
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCarbonmonoxide.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(BlockCanisterred.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemMethanol.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 2));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockNitrogendioxidecylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHno3.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockAmmoniacylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemAmmoniasolution.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSodiumhydroxidesolution.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemBleach.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCarbonmonoxide.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemLeadIIoxide.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemLeadpowderimpure.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockHydrogenFluoride.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHydrofluoricacid.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCarbonmonoxide.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemLeadIIoxidetechnicalgrade.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemLeadpowdertechnicalgrade.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSludge.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemChlorinatedanodemud.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCarbonmonoxide.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemLeadoxideIIpure.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemLeadpowderpure.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockAmmoniacylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSodiummetal.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemSodiumamide.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockNitrousoxidegascylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemSodiumamide.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemNaN3.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemAluminumnugget.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemAluminumchlorideanhydrous.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockChlorinecylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(BlockCanisterred.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockHydrogenchloridecylinder.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockHydrogenchloridecylinder.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemHydrochloricacid.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(BlockCanisterred.block, (int) (1)).getItem()) && ((new Object() {
				public ItemStack getItemStack(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(ItemMetaloxides.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemCopperpowderimpure.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (2))) + 1));
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockEmptygascylinder2.block, (int) (1));
							_setstack.setCount(((new Object() {
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
							}.getAmount((int) (3))) + 1));
							((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
