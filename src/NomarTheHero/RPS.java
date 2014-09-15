package NomarTheHero;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class RPS extends JavaPlugin {
	
	private static RPS plugin = new RPS();
	
	private String prefix = ChatColor.BLUE + "[" + ChatColor.GREEN + "RPS" + ChatColor.BLUE + "]" + ChatColor.DARK_AQUA + " - " + ChatColor.GREEN;
	
	private GameManager gameManager = new GameManager();
	
	/*
	 * 
	 * SOUNDS
	 * 
	 *Game class (getPlayers, getChoice etc)
	 *Choice Enum class
	 * 
	 *GameManager class
	 *
	 * "/rps duel <player>"
	 * "/rps accept <player>"
	 * "/rps quit"
	 * 
	 * "/rps rock / paper / scissor"
	 * 
	 * Countdown 3... 2.. 1.. player1: Rock! Player2: Scissor! <player> Won!
	 * 
	 * Best out of 3 wins!
	 * 
	 */
        
    
	
    
   public void onEnable(){
	   this.getCommand("rps").setExecutor(new CommandHandler());
   }
    

   public static RPS getPlugin() {
	   return plugin;
   }
   
   public GameManager getGameManager() {
	   return gameManager;
   }
   
   public String getPrefix() {
	   return prefix;
   }


}
