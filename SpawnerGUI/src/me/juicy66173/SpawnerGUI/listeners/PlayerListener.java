package me.juicy66173.SpawnerGUI.listeners;

import me.juicy66173.SpawnerGUI.SpawnerGUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerListener implements Listener {

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (event.getClickedBlock().getType() == Material.MOB_SPAWNER) {
				Player player = event.getPlayer();
				CreatureSpawner spawner = (CreatureSpawner) event
						.getClickedBlock().getState();
				
				if (!player.hasPermission("spawnergui.edit"))
					return;

				if (SpawnerGUI.spawners.containsKey(player))
					SpawnerGUI.spawners.remove(player);
				SpawnerGUI.spawners.put(player, spawner);

				Inventory inv = Bukkit.createInventory(null, 27, ChatColor.AQUA
						+ "Spawner");

				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 50), ChatColor.RED
						+ "Creeper"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 51), ChatColor.RED
						+ "Skeleton"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 52), ChatColor.RED
						+ "Spider"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 54), ChatColor.RED
						+ "Zombie"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 55), ChatColor.RED
						+ "Slime"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 56), ChatColor.RED
						+ "Ghast"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 57), ChatColor.RED
						+ "Zombie Pigman"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 58), ChatColor.RED
						+ "Enderman"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 59), ChatColor.RED
						+ "Cave Spider"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 60), ChatColor.RED
						+ "Silverfish"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 61), ChatColor.RED
						+ "Blaze"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 62), ChatColor.RED
						+ "Magma Cube"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 65), ChatColor.RED
						+ "Bat"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 66), ChatColor.RED
						+ "Witch"));

				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 90), ChatColor.GREEN
						+ "Pig"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 91), ChatColor.GREEN
						+ "Sheep"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 92), ChatColor.GREEN
						+ "Cow"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 93), ChatColor.GREEN
						+ "Chicken"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 94), ChatColor.GREEN
						+ "Squid"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 95), ChatColor.GREEN
						+ "Wolf"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 96), ChatColor.GREEN
						+ "Mooshroom"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 97), ChatColor.GREEN
						+ "Snow Golem"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 98), ChatColor.GREEN
						+ "Ocelot"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 99), ChatColor.GREEN
						+ "Iron Golem"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 100), ChatColor.GREEN
						+ "Horse"));
				inv.addItem(SpawnerGUI.setName(new ItemStack(
						Material.MONSTER_EGG, 1, (short) 120), ChatColor.GREEN
						+ "Villager"));

				player.openInventory(inv);
			}
		}
	}
}
