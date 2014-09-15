package NomarTheHero;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.entity.Player;

public class Game {
	
	private HashMap<String, Choice> playerChoice = new HashMap<String, Choice>();
	
	String player1;
	String player2;
	
	private String winner;
	private String loser;
	
	public Game(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	
	public void setChoice(String playerName, Choice choice) {
		playerChoice.put(playerName, choice);
	}
	
	
	public String chooseWinner() {
		String winner = null;
		
		return null;
	}
	
	
	public Choice getChoice(String playerName) {
		return playerChoice.get(playerName);
	}
	
	
	
	

}
