package NomarTheHero;

import java.util.HashMap;
import java.util.HashSet;

import org.bukkit.entity.Player;

public class GameManager {
	
	private HashMap<String, Game> gamePlayerIsIn = new HashMap<String, Game>();
	
	private HashSet<String> isPlayerInGame = new HashSet<String>();
	
	
	
	public void genGame(Player p1, Player p2, boolean computer) {
		
		if (computer == true) {
			
			String p1Name = p1.getName();
			
			Game game = new Game(p1Name, "Computer");
			
			isPlayerInGame.add(p1Name);
			gamePlayerIsIn.put(p1Name, game);
			
			p1.sendMessage("Starting game against the computer...");
			
		}
		
		else {
			
			String p1Name = p1.getName();
			String p2Name = p2.getName();
			
			Game game = new Game(p1Name, p2Name);
			
			isPlayerInGame.add(p1Name);
			isPlayerInGame.add(p2Name);
			gamePlayerIsIn.put(p1Name, game);
			gamePlayerIsIn.put(p2Name, game);
			
		}
		
		
	}
	
	
	
	public Game getGame(String playerName) {
		return gamePlayerIsIn.get(playerName);
	}
	
	public boolean isPlayerInGame(String playerName) {
		if (this.isPlayerInGame.contains(playerName))
			return true;
		
		return false;
	}
	
	public Choice getChoiceFromString(String choice) {
		if (choice.equalsIgnoreCase("rock"))
			return Choice.ROCK;
		
		else if (choice.equalsIgnoreCase("paper")) 
			return Choice.PAPER;
		
		else if (choice.equalsIgnoreCase("scissor"))
			return Choice.SCISSOR;
		
		else return null;
	}
	

}
