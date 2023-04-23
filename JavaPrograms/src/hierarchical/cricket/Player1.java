package hierarchical.cricket;

public class Player1 extends Cricket{
	
	int numberofcen;
	int numberofhalfcen;
	
	public void play1(String name, int matchesplay, int runscore, int numberofcen,int numberofhalfcen)
	{
		this.name=name;
		this.matchesplay=matchesplay;
		this.runscore=runscore;
		this.numberofcen=numberofcen;
		this.numberofhalfcen=numberofhalfcen;
		
	}
 public void print()
 {
	
	 System.out.println(name + " played " +matchesplay+ " matches and scored " +runscore+ " runs and He is a strong batsmen and made " +numberofcen+ " centuries and " +numberofhalfcen+ " half centuries \n" );
	
 }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
