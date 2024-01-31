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
			
		int matchtime = 3;
		int time = 3;
		System.out.println("\nThe game starts in...");
		
		do {
			System.out.println(time +  "!" );
			time = time - 1;
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				
			} catch(InterruptedException ex) {
			}
		} while(time>=1);
		
		System.out.println("The match begins!");
		
		
		do {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				
			} catch(InterruptedException ex) {
			}
			if(matchtime == 3) {
				System.out.println("\n(3\") It is the 3rd minute of the game.");
			} else {
				System.out.println("\n("+ matchtime + "\")"+ "It is the " + matchtime + "th minute of the game.");
			}
			matchtime += 3;	
			
			int situationRoll = random.nextInt(6) + 1;
			
			if((matchtime%2) != 0) {
				switch(situationRoll) {
				case 1: soccerteamOne.chance_goal();
					break;
				case 2: soccerteamOne.chance_foul();
					break;
				case 3: soccerteamOne.chance_freekick();
					break;
				case 4: if(soccerteamOne.userRollMain == 6) {
					soccerteamTwo.injured();
				} else {
					soccerteamOne.chance_foul();
				}
					break;
				case 5: soccerteamOne.chance_penalty();
					break;
				case 6: soccerteamOne.chance_sleep();
					break;
				}
				
			} else {
				switch(situationRoll) {
				case 1: soccerteamTwo.chance_goal();
					break;
				case 2: soccerteamTwo.chance_foul();
					break;
				case 3: soccerteamTwo.chance_freekick();
					break;
				case 4: soccerteamTwo.chance_injured();
					break;
				case 5: soccerteamTwo.chance_penalty();
					break;
				case 6: soccerteamTwo.chance_sleep();
					break;
				}
			}
		} while(matchtime<=90);
				
			
		
		
		System.out.printf("FINAL SCORE: %s %d -  %d %s :",soccerteamOne.teamname , soccerteamOne.goals, soccerteamTwo.goals,soccerteamTwo.teamname );
			}
		}