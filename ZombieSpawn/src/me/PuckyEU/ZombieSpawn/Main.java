package me.PuckyEU.ZombieSpawn;

import org.bukkit.plugin.java.JavaPlugin;

import me.PuckyEU.ZombieSpawn.commands.zombieCommands;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new zombieCommands(this);
	}
}
