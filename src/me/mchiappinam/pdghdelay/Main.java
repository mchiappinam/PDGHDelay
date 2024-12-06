package me.mchiappinam.pdghdelay;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHDelay] §2ativando...");
		getServer().getPluginManager().registerEvents(new Listeners(this), this);
		if(getServer().getOnlinePlayers().size()>0) {
			getServer().getConsoleSender().sendMessage("§3[PDGHDelay] §2definindo o delay de todos para 8");
			for(Player p : getServer().getOnlinePlayers()) {
				p.setNoDamageTicks(20);
				p.setMaximumNoDamageTicks(20);
			}
				//p.setMaximumNoDamageTicks(0);
			getServer().getConsoleSender().sendMessage("§3[PDGHDelay] §2delay definido");
		}
		getServer().getConsoleSender().sendMessage("§3[PDGHDelay] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHDelay] §2Acesse: http://pdgh.com.br/");
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHDelay] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHDelay] §2Acesse: http://pdgh.com.br/");
	}
  
  
  
  
  
  
  
  
  
  
}