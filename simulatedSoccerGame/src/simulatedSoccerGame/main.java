package simulatedSoccerGame;
		import java.util.*;

		public class main {
			
			public static void main(String[] args) {
				
				Random random = new Random();
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("5v5 Simulated Game");
				System.out.println("Rules: ");
				System.out.println("There are a total of 30 turns, in which there will be a roll of a six sided dice.");
				System.out.println("The number rolled will determine what is the action fo your team.\n");
				
				
				System.out.println("What do you want to name your name player One? ");
				String playerOneTeam = scanner.nextLine();
				
				System.out.println("What do you want to name your name player Two? ");
				String playerTwoTeam = scanner.nextLine();
				
				SoccerTeam soccerteamOne = new SoccerTeam(playerOneTeam); 
				SoccerTeam soccerteamTwo = new SoccerTeam(playerTwoTeam); 
				
				System.out.printf("\nWelcome %s and %s to the Goochland Grand Finals, the winnder of this game will win the cup!", soccerteamOne.teamname, soccerteamTwo.teamname);
				
				
			}
		}