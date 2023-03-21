package me.Szymonek223.podmien;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener{
	public static boolean isthisenchant = false;
	public void onEnable() {
		super.onEnable();
		Chujenchant.register();
		getCommand("podmien").setExecutor(new PodmienCommand());
		getServer().getPluginManager().registerEvents(new event(),this);
		
	}
	
}
