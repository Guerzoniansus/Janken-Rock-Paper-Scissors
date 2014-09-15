package NomarTheHero;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
	
	RPS plugin = RPS.getPlugin();
	GameManager gm = plugin.getGameManager();
	private String prefix = plugin.getPrefix();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		Player player = (Player) sender;
		
		if (args.length == 1) {
			
			String arg1 = args[0];
			
			if (arg1.equalsIgnoreCase("rock") || arg1.equalsIgnoreCase("paper") || arg1.equalsIgnoreCase("scissor")) {
				
				
						
			}
			
			else if (arg1.equalsIgnoreCase("help")) {
				
				
				
			}
			
			else {
				
				String playerName = arg1;
				
				if (checks(player, playerName, arg1) == true) {
					
					
					
				}
				
			}
					
		}	
		
		return false;
	}
	
	
	private boolean checks(Player player, String p1, String p2) {
		
		if (gm.isPlayerInGame(p1) == true) {
			player.sendMessage(prefix + "You are already in a game!");
			return false;
		}
		
		if (Bukkit.getPlayer(p2) == null) {				
			player.sendMessage(prefix + ChatColor.BLUE + "Player is not online!");
			return false;
		}
		
		if (gm.isPlayerInGame(p2) == true) {
			player.sendMessage(prefix + "That person is already in a game!");
			return false;
		}

		
		
		return true;
	}

	

}




