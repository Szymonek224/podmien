package me.Szymonek223.podmien;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class event implements Listener{
	@EventHandler
	public void onItemHeld(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchants() || player.getInventory().getItemInMainHand().getType() == Material.ENCHANTED_BOOK) {
            Main.isthisenchant = true;
        }
        else {
        Main.isthisenchant = false;
}
}
}
