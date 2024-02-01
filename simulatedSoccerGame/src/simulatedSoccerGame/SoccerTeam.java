package simulatedSoccerGame;
import java.util.*;



public class SoccerTeam {

	String teamname;
	static int check = 0;
	ArrayList <String> cputeam = new ArrayList();
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	int goals = 0;
	int userRollMain = random.nextInt(6) +1;
	int userRollOpp = random.nextInt(6) +1;
	int randomPlayer = random.nextInt(4);

	SoccerTeam(String teamname){
		
		this.teamname = teamname;
		this.goals = goals;
		
		
		if (check == 0 ) {
			this.cputeam.add("R1");
			this.cputeam.add("R2");
			this.cputeam.add("R3");
			this.cputeam.add("R4");
			this.cputeam.add("R5");
			
			check++;
		} else {
			this.cputeam.add("B1");
			this.cputeam.add("B2");
			this.cputeam.add("B3");
			this.cputeam.add("B4");
			this.cputeam.add("B5");
			
		}	
		
	
	}
	
	void chance_goal() {
		userRollMain = random.nextInt(6) +1;
		userRollOpp = random.nextInt(6) +1;
		
		if(userRollMain > userRollOpp) {
			this.goals ++;
			System.out.println(this.teamname + " have scored!\n");
			
			
		} else {
			System.out.println(this.teamname + " have failed to secure the goal!\n");
		}
		
	}
	void chance_foul() {
		userRollMain = random.nextInt(6) +1;
		userRollOpp = random.nextInt(6) +1;
		
		if (userRollMain >=2) {
			System.out.println("Looks like the foul was clean and no card will be given.\n");
		} else if(userRollMain == 1) {
			int playerRandom = random.nextInt(4);
			System.out.println("A bad foul from " + this.cputeam.get(playerRandom) + " has offered an opportunity for the opposing team to score a penalty!\n" );
			this.cputeam.remove(playerRandom);
		}
		
	}
	void chance_injured() {
		userRollMain = random.nextInt(6) +1;
		userRollOpp = random.nextInt(6) +1;
		
	}
	void chance_penalty() {
		userRollMain = random.nextInt(6) +1;
		int playerRandom =  random.nextInt(4);
		
		if(userRollMain == 6) {
			System.out.println(this.cputeam.get(playerRandom) + " has scored the penalty!\n");
			this.goals++;
			
		} else if (userRollMain == 1){
			System.out.println(this.cputeam.get(playerRandom) + " has missed the penalty!\n");
		} 
		
	}
	void chance_freekick() {
		userRollMain = random.nextInt(6) +1;
		userRollOpp = random.nextInt(6) +1;
		int playerRandom = random.nextInt(4);
		
		if(userRollMain >userRollOpp) {
			
			System.out.println(this.cputeam.get(playerRandom) + " has scored the freekick!\n");
			this.goals ++;
		} else if (userRollMain == 1){
			System.out.println(this.cputeam.get(playerRandom) + " has missed the freekick!\n");
		}
		
	}
	void chance_sleep() {
		return;
	}
	
	void injured() {
			int playerRandom = random.nextInt(4);
			System.out.println("The player " + this.cputeam.get(playerRandom) + " has gotten injured and no card was given!\n" );
			
	}
		
	}