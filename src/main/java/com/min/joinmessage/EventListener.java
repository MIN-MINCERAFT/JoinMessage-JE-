package com.min.joinmessage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public class EventListener implements Listener {
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		@NotNull Player player = event.getPlayer();
		event.joinMessage(
				net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer.legacySection().deserialize(
						JoinMessage.PREFIX + player.getName() + "님! 민의 서버의 오신것을 환영합니다!"
				)
		);
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		@NotNull Player player = event.getPlayer();
		event.quitMessage(
				net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer.legacySection().deserialize(
						JoinMessage.PREFIX + player.getName() + "님! 다음에 또오세요! 잘가요~"
				)
		);
	}
}
