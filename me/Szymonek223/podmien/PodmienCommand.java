package me.Szymonek223.podmien;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

public class PodmienCommand implements CommandExecutor,Listener {
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args){
			if(sender.isOp()) {
				Player p = (Player)sender;
				if(Main.isthisenchant==true) {
		            ItemMeta Itemek = p.getInventory().getItemInMainHand().getItemMeta();
		            Itemek.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		            Itemek.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		            p.getInventory().getItemInMainHand().addUnsafeEnchantment(Chujenchant.CHUJ, 1);
		            List<String> lore = new ArrayList<String>();
		            lore.add(ChatColor.YELLOW + "CHUJ");
		            Itemek.setLore(lore);
		            p.getInventory().getItemInMainHand().setItemMeta(Itemek);
		            
		            
					
				}
			}
		return false;
	}

	}

