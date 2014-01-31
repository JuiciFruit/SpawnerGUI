package me.juicy66173.SpawnerGUI.listeners;

import me.juicy66173.SpawnerGUI.SpawnerGUI;

import org.bukkit.ChatColor;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

@SuppressWarnings("deprecation")
public class InventoryListener implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {

		if ((event.getInventory().getName().equalsIgnoreCase(ChatColor.AQUA
				+ "Spawner"))
				&& (event.getInventory().getSize() == 27)) {
			int slot = event.getRawSlot();
			Player player = (Player) event.getWhoClicked();

			if (!SpawnerGUI.spawners.containsKey(player)) {
				return;
			}
			CreatureSpawner spawner = SpawnerGUI.spawners.get(player);

			if (slot == 0) {
				if (player.hasPermission("spawnergui.spawn." + "creeper")) {
					spawner.setSpawnedType(EntityType.CREEPER);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 1) {
				if (player.hasPermission("spawnergui.spawn." + "skeleton")) {
					spawner.setSpawnedType(EntityType.SKELETON);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 2) {
				if (player.hasPermission("spawnergui.spawn." + "spider")) {
					spawner.setSpawnedType(EntityType.SPIDER);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 3) {
				if (player.hasPermission("spawnergui.spawn." + "zombie")) {
					spawner.setSpawnedType(EntityType.ZOMBIE);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 4) {
				if (player.hasPermission("spawnergui.spawn." + "slime")) {
					spawner.setSpawnedType(EntityType.SLIME);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 5) {
				if (player.hasPermission("spawnergui.spawn." + "ghast")) {
					spawner.setSpawnedType(EntityType.GHAST);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 6) {
				if (player.hasPermission("spawnergui.spawn." + "pigzombie")) {
					spawner.setSpawnedType(EntityType.PIG_ZOMBIE);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 7) {
				if (player.hasPermission("spawnergui.spawn." + "enderman")) {
					spawner.setSpawnedType(EntityType.ENDERMAN);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 8) {
				if (player.hasPermission("spawnergui.spawn." + "cavespider")) {
					spawner.setSpawnedType(EntityType.CAVE_SPIDER);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 9) {
				if (player.hasPermission("spawnergui.spawn." + "silverfish")) {
					spawner.setSpawnedType(EntityType.SILVERFISH);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 10) {
				if (player.hasPermission("spawnergui.spawn." + "blaze")) {
					spawner.setSpawnedType(EntityType.BLAZE);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 11) {
				if (player.hasPermission("spawnergui.spawn." + "magmacube")) {
					spawner.setSpawnedType(EntityType.MAGMA_CUBE);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 12) {
				if (player.hasPermission("spawnergui.spawn." + "bat")) {
					spawner.setSpawnedType(EntityType.BAT);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 13) {
				if (player.hasPermission("spawnergui.spawn." + "witch")) {
					spawner.setSpawnedType(EntityType.WITCH);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 14) {
				if (player.hasPermission("spawnergui.spawn." + "pig")) {
					spawner.setSpawnedType(EntityType.PIG);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 15) {
				if (player.hasPermission("spawnergui.spawn." + "sheep")) {
					spawner.setSpawnedType(EntityType.SHEEP);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 16) {
				if (player.hasPermission("spawnergui.spawn." + "cow")) {
					spawner.setSpawnedType(EntityType.COW);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 17) {
				if (player.hasPermission("spawnergui.spawn." + "chicken")) {
					spawner.setSpawnedType(EntityType.CHICKEN);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 18) {
				if (player.hasPermission("spawnergui.spawn." + "squid")) {
					spawner.setSpawnedType(EntityType.SQUID);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 19) {
				if (player.hasPermission("spawnergui.spawn." + "wolf")) {
					spawner.setSpawnedType(EntityType.WOLF);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 20) {
				if (player.hasPermission("spawnergui.spawn." + "mushroomcow")) {
					spawner.setSpawnedType(EntityType.MUSHROOM_COW);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 21) {
				if (player.hasPermission("spawnergui.spawn." + "snowman")) {
					spawner.setSpawnedType(EntityType.SNOWMAN);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 22) {
				if (player.hasPermission("spawnergui.spawn." + "ocelot")) {
					spawner.setSpawnedType(EntityType.OCELOT);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 23) {
				if (player.hasPermission("spawnergui.spawn." + "irongolem")) {
					spawner.setSpawnedType(EntityType.IRON_GOLEM);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 24) {
				if (player.hasPermission("spawnergui.spawn." + "horse")) {
					spawner.setSpawnedType(EntityType.HORSE);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			} else if (slot == 25) {
				if (player.hasPermission("spawnergui.spawn." + "villager")) {
					spawner.setSpawnedType(EntityType.VILLAGER);
					SpawnerGUI.msg(player, "Spawner set to spawn "
							+ spawner.getSpawnedType().getName() + ".");
				}
			}

			spawner.update();

			event.setCancelled(true);
		}
	}

	@EventHandler
	public void onInventoryDrag(InventoryDragEvent event) {
		if ((event.getInventory().getName().equalsIgnoreCase(ChatColor.AQUA
				+ "Spawner"))
				&& (event.getInventory().getSize() == 27)) {
			event.setCancelled(true);
		}
	}
}
