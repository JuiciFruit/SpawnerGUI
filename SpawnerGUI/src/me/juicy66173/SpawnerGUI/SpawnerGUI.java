package me.juicy66173.SpawnerGUI;

import java.util.HashMap;
import java.util.logging.Logger;

import me.juicy66173.SpawnerGUI.commands.SpawnerPluginCommand;
import me.juicy66173.SpawnerGUI.listeners.InventoryListener;
import me.juicy66173.SpawnerGUI.listeners.PlayerListener;

import org.bukkit.ChatColor;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnerGUI extends JavaPlugin {

	public static SpawnerGUI mainPlugin;
	public static String loggerPrefix = "[SpawnerGUI] ";
	public static Logger logger = Logger.getLogger("Minecraft.SpawnerGUI");

	public static HashMap<Player, CreatureSpawner> spawners = new HashMap<Player, CreatureSpawner>();

	public void onDisable() {
		log("SpawnerGUI by Juicy66173!");
	}

	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();

		log("SpawnerGUI by Juicy66173!");

		mainPlugin = this;

		pm.registerEvents(new InventoryListener(), this);
		pm.registerEvents(new PlayerListener(), this);

		getCommand("spawner").setExecutor(new SpawnerPluginCommand(this));
	}

	/* ===== Methods ===== */

	public static void noPerm(Player player) {
		errMsg(player, "You do not have permission to do this.");
	}

	public static void usage(Player player, String cmd, String usage) {
		player.sendMessage(ChatColor.RED + "Usage: " + "/" + cmd + " " + usage);
	}

	public static void msg(Player player, String str) {
		player.sendMessage(ChatColor.YELLOW + ChatColor.BOLD.toString()
				+ loggerPrefix + ChatColor.YELLOW + str);
	}

	public static void msg(CommandSender sender, String str) {
		sender.sendMessage(ChatColor.YELLOW + ChatColor.BOLD.toString()
				+ loggerPrefix + ChatColor.YELLOW + str);
	}

	public static void errMsg(Player player, String str) {
		player.sendMessage(ChatColor.RED + ChatColor.BOLD.toString()
				+ loggerPrefix + ChatColor.RED + str);
	}

	public static void errMsg(CommandSender sender, String str) {
		sender.sendMessage(ChatColor.RED + ChatColor.BOLD.toString()
				+ loggerPrefix + ChatColor.RED + str);
	}

	public static void log(String text) {
		logger.info(loggerPrefix + text);
	}

	public static void log(Throwable e) {
		logger.severe(loggerPrefix + e.toString());
		e.printStackTrace();
	}

	public static ItemStack setName(ItemStack stack, String name) {
		ItemMeta meta = stack.getItemMeta();
		meta.setDisplayName(name);
		stack.setItemMeta(meta);
		return stack;
	}
}
