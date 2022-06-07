package com.min.joinmessage;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinMessage extends JavaPlugin {
	public static final String PREFIX = "<민 서버> ";
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EventListener(), this);
		getLogger().info("This plugin is made by Min");
	}
}
