package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.block.state.IBlockState;

import net.mcreator.explosivesrightthistime.item.ItemSodiummetal;
import net.mcreator.explosivesrightthistime.item.ItemSodiumhydroxide;
import net.mcreator.explosivesrightthistime.item.ItemLeadacidbattery;
import net.mcreator.explosivesrightthistime.item.ItemGraphiteelectrode;
import net.mcreator.explosivesrightthistime.item.ItemCryolite;
import net.mcreator.explosivesrightthistime.item.ItemCopperelectrodetechnicalgrade;
import net.mcreator.explosivesrightthistime.item.ItemCOpperelectrodepure;
import net.mcreator.explosivesrightthistime.item.ItemAluminumnugget;
import net.mcreator.explosivesrightthistime.item.ItemAl2o3;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureMoltensaltelectro extends ElementsChemcraft.ModElement {
	public ProcedureMoltensaltelectro(ElementsChemcraft instance) {
		super(instance, 351);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Moltensaltelectro!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Moltensaltelectro!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Moltensaltelectro!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Moltensaltelectro!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double previousrecipe = 0;
		previousrecipe = (double) (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "recipe"));
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemSodiumhydroxide.block, (int) (1))
				.getItem()) && (((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
						.getItem() == new ItemStack(ItemCOpperelectrodepure.block, (int) (1)).getItem()) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(ItemCopperelectrodetechnicalgrade.block, (int) (1)).getItem()))
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemCOpperelectrodepure.block, (int) (1)).getItem()) || ((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(ItemCopperelectrodetechnicalgrade.block, (int) (1)).getItem())))
						&& ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
								.getItem() == new ItemStack(ItemLeadacidbattery.block, (int) (1)).getItem())))
				&& ((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemSodiummetal.block, (int) (1))
						.getItem()) && ((((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63) && ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (5))) == 0)) && (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) == 1) && (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 1) && ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (3))) == 1))))) || ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)))) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("recipe", 0);
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5))).getItem() == new ItemStack(ItemCryolite.block, (int) (1)).getItem())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemAl2o3.block, (int) (1)).getItem()))
				&& ((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemGraphiteelectrode.block, (int) (1))
						.getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemGraphiteelectrode.block, (int) (1)).getItem()))
						&& ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
								.getItem() == new ItemStack(ItemLeadacidbattery.block, (int) (1)).getItem())))
				&& ((((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemAluminumnugget.block, (int) (1))
						.getItem()) && ((((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (5))) <= 63) && ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) && (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) == 1) && (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) == 1) && ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (3))) == 1))))) || ((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot) {
									ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) == 0)))) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("recipe", 1);
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("recipe", -1);
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if (((previousrecipe) != (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "recipe")))) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("timer", 0);
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "recipe")) >= 0)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "timer")) >= 200)) {
				if (((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "recipe")) == 0)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemSodiummetal.block, (int) (1));
							_setstack.setCount(((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot) {
										ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
				} else if (((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "recipe")) == 1)) {
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv != null && (inv instanceof TileEntityLockableLoot)) {
							ItemStack _setstack = new ItemStack(ItemAluminumnugget.block, (int) (1));
							_setstack.setCount(((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot) {
										ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) + 1));
							((TileEntityLockableLoot) inv).setInventorySlotContents((int) (1), _setstack);
						}
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof TileEntityLockableLoot)
							((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
					}
				}
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("timer", 0);
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			}
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuel")) == 0)) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) != 0)) {
					if (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemAl2o3.block, (int) (1))
							.getItem())) {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setDouble("fuel", 200);
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setDouble("maxFuel", 200);
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					} else if (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
							.getItem() == new ItemStack(ItemSodiumhydroxide.block, (int) (1)).getItem())) {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
						}
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setDouble("fuel", 200);
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							IBlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().setDouble("maxFuel", 200);
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
					}
				} else {
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("timer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			}
		}
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "recipe")) >= 0)) {
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuel")) > 0)) {
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("fuel", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuel")) - 1));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "recipe")) >= 0)) {
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("timer", ((new Object() {
								public double getValue(BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(new BlockPos((int) x, (int) y, (int) z), "timer")) + 1));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			}
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("fuelRemaining", (((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuel")) / (new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "maxFuel"))) * 100));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
	}
}
