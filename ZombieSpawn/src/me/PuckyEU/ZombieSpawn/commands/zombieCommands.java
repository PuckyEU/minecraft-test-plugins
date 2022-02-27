package me.PuckyEU.ZombieSpawn.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import me.PuckyEU.ZombieSpawn.Main;

public class zombieCommands implements CommandExecutor{
	private Main plugin;
	
	public zombieCommands(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("Zombie").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		Location loc = p.getLocation();
		World w = p.getWorld();
		
		for(int i = 0; i < 10; i++) {
			w.spawnEntity(loc, EntityType.ZOMBIE);
		}
		
		
		
		
		return false;
	}
}
