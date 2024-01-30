package simulatedSoccerGame;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class main {
			
	public static void main(String[] args) {
				
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int gametime =0;
				
		System.out.println("5v5 Simulated Game");
		System.out.println("Rules: ");
		System.out.println("There are a total of 30 turns, in which there will be a roll of a six sided dice.");
		System.out.println("The number rolled will determine what is the action for your team.\n");
				
				
		System.out.println("What do you want to name your team, player One? ");
		String playerOneTeam = scanner.nextLine();
		SoccerTeam soccerteamOne = new SoccerTeam(playerOneTeam); 
				
		System.out.println("What do you want to name your team, player Two? ");
		String playerTwoTeam = scanner.nextLine(); 
		SoccerTeam soccerteamTwo = new SoccerTeam(playerTwoTeam); 
				
				
		System.out.printf("\nWelcome %s (R team) and %s (B team) to the Goochland Grand Finals, the winner of this game will win the cup!", soccerteamOne.teamname, soccerteamTwo.teamname);
			
		
		
		int i = 3;
		int time = 3;
		
		System.out.println("\nThe game starts in...");
		
		do {
			System.out.println(time +  "!" );
			time = time - 1;
			i = i-1;
			try {
				
				TimeUnit.MILLISECONDS.sleep(1000);
				
			} catch(InterruptedException ex) {
			}
		} while(i>=1);
		
		System.out.println("The match begins!");
			
		
		

			
			
			
			

				
		
				
				
			}
		}