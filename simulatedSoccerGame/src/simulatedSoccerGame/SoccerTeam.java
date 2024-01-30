package simulatedSoccerGame;
import java.util.ArrayList;

public class SoccerTeam {
	
	

	String teamname;
	static int check = 0;
	ArrayList <String> cputeam = new ArrayList();
	

	SoccerTeam(String teamname){
		
		
		
		this.teamname = teamname;
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

	

}