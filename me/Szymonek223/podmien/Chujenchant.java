package me.Szymonek223.podmien;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;

public class Chujenchant {
	public static final Enchantment CHUJ = new EnchantmentWrapper("chuj");
	public static void registerEnchantment(Enchantment enchantment) {
		boolean registered = true;
		try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null,true);
			Enchantment.registerEnchantment(enchantment);
		}catch(Exception e) {
			registered = false;
			e.printStackTrace();
		}
	}
	public static void register() {
		boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CHUJ);
		if(!registered) {
			registerEnchantment(CHUJ);
		}
		
	}
}
