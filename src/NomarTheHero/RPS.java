package NomarTheHero;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;


public class RPS extends JavaPlugin {
	
	private static RPS plugin;
	
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
	 * "/rps quit"
	 * 
	 * "/rps rock / paper / scissor"
	 * 
	 * Countdown 3... 2.. 1.. player1: Rock! Player2: Scissor! <player> Won!
	 * 
	 * Best out of 3 wins!
	 * 
	 * Later: Player vs Computer mode
	 * 
	 */
        
    
   public void onEnable(){
	   plugin = this;
	   
	   plugin.getCommand("rps").setExecutor(new CommandHandler());
	   
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
