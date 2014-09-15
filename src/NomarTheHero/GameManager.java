package NomarTheHero;

import java.util.HashMap;
import java.util.HashSet;

import org.bukkit.entity.Player;

public class GameManager {
	
	
	private HashMap<String, Game> gamePlayerIsIn = new HashMap<String, Game>();
	
	private HashSet<String> isPlayerInGame = new HashSet<String>();
	
	
	
	
	
	public Game getGame(String playerName) {
		return gamePlayerIsIn.get(playerName);
	}
	
	
	public boolean isPlayerInGame(String playerName) {
		if (this.isPlayerInGame.contains(playerName))
			return true;
		
		return false;
	}

}
