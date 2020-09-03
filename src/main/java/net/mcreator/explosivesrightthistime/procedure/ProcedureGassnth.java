package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.item.ItemUrea;
import net.mcreator.explosivesrightthistime.item.ItemSulfurpowder;
import net.mcreator.explosivesrightthistime.item.ItemSilver;
import net.mcreator.explosivesrightthistime.item.ItemSalt;
import net.mcreator.explosivesrightthistime.item.ItemPotassiumchloride;
import net.mcreator.explosivesrightthistime.item.ItemPbNITRATE;
import net.mcreator.explosivesrightthistime.item.ItemMercurynitrate;
import net.mcreator.explosivesrightthistime.item.ItemMercury;
import net.mcreator.explosivesrightthistime.item.ItemManganesedioxide;
import net.mcreator.explosivesrightthistime.item.ItemManganeseIIchloride;
import net.mcreator.explosivesrightthistime.item.ItemLead;
import net.mcreator.explosivesrightthistime.item.ItemHydrochloricacid;
import net.mcreator.explosivesrightthistime.item.ItemHno3;
import net.mcreator.explosivesrightthistime.item.ItemH2s04;
import net.mcreator.explosivesrightthistime.item.ItemDisstiledwater;
import net.mcreator.explosivesrightthistime.item.ItemCyanuricacid;
import net.mcreator.explosivesrightthistime.item.ItemCopperoxide;
import net.mcreator.explosivesrightthistime.item.ItemCoppernitrate;
import net.mcreator.explosivesrightthistime.item.ItemCopper;
import net.mcreator.explosivesrightthistime.item.ItemCoke;
import net.mcreator.explosivesrightthistime.item.ItemCaF2;
import net.mcreator.explosivesrightthistime.item.ItemAgno3;
import net.mcreator.explosivesrightthistime.block.BlockSulfurdioxidecylinder;
import net.mcreator.explosivesrightthistime.block.BlockNitrogendioxidecylinder;
import net.mcreator.explosivesrightthistime.block.BlockHydrogenchloridecylinder;
import net.mcreator.explosivesrightthistime.block.BlockHydrogenFluoride;
import net.mcreator.explosivesrightthistime.block.BlockEmptygascylinder2;
import net.mcreator.explosivesrightthistime.block.BlockChlorinecylinder;
import net.mcreator.explosivesrightthistime.block.BlockCarbonmonoxide;
import net.mcreator.explosivesrightthistime.block.BlockAmmoniacylinder;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

import java.util.function.Supplier;
import java.util.Map;

@ElementsChemcraft.ModElement.Tag
public class ProcedureGassnth extends ElementsChemcraft.ModElement {
	public ProcedureGassnth(ElementsChemcraft instance) {
		super(instance, 112);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Gassnth!");
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemUrea.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem())) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSulfurpowder.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem())) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCopper.block, (int) (1)).getItem()) && (((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem()))) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCoke.block, (int) (1)).getItem()) && (((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem()))) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemLead.block, (int) (1)).getItem()) && (((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem()))) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSilver.block, (int) (1)).getItem()) && (((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem()))) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCaF2.block, (int) (1)).getItem()) && (((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemH2s04.block, (int) (1)).getItem()))) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCoppernitrate.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem())) || ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemManganesedioxide.block, (int) (1)).getItem()) && (((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHydrochloricacid.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()))) || (((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSalt.block, (int) (1)).getItem()) || ((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemPotassiumchloride.block, (int) (1)).getItem())) && (((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemH2s04.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()))) || (((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemMercury.block, (int) (1)).getItem()) && (((new Object() {
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
		}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem()) && ((new Object() {
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
		}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()))))))))))))))) {
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSulfurpowder.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockSulfurdioxidecylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemUrea.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockAmmoniacylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemCyanuricacid.block, (int) (1));
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCopper.block, (int) (1)).getItem()) && (((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockNitrogendioxidecylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemCoppernitrate.block, (int) (1));
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCoke.block, (int) (1)).getItem()) && (((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemDisstiledwater.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockCarbonmonoxide.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemLead.block, (int) (1)).getItem()) && (((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockNitrogendioxidecylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemPbNITRATE.block, (int) (1));
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSilver.block, (int) (1)).getItem()) && (((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockNitrogendioxidecylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemAgno3.block, (int) (1));
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCaF2.block, (int) (1)).getItem()) && (((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemH2s04.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockHydrogenFluoride.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemCoppernitrate.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem()))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockNitrogendioxidecylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemCopperoxide.block, (int) (1));
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemManganesedioxide.block, (int) (1)).getItem()) && (((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHydrochloricacid.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockChlorinecylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemManganeseIIchloride.block, (int) (1));
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
			}
			if (((((new Object() {
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemSalt.block, (int) (1)).getItem()) || ((new Object() {
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemPotassiumchloride.block, (int) (1)).getItem())) && (((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemH2s04.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
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
			}.getItemStack((int) (0))).getItem() == new ItemStack(ItemMercury.block, (int) (1)).getItem()) && (((new Object() {
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
			}.getItemStack((int) (4))).getItem() == new ItemStack(ItemHno3.block, (int) (1)).getItem()) && ((new Object() {
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
			}.getItemStack((int) (3))).getItem() == new ItemStack(BlockEmptygascylinder2.block, (int) (1)).getItem())))) {
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
							((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(BlockNitrogendioxidecylinder.block, (int) (1));
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
							}.getAmount((int) (1))) + 1));
							((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(ItemMercurynitrate.block, (int) (1));
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
			}
		}
	}
}
