package hierarchical.cricket;

public class Player2 extends Cricket{
	
	int wickets;
	
	public void play2(String name, int matchesplay, int runscore,int wickets)
	{
		this.name=name;
		this.matchesplay=matchesplay;
		this.runscore=runscore;
		this.wickets=wickets;
	}
	
	public void print()
	{
		System.out.println(name + " played " +matchesplay+ " matches and scored " +runscore+ " runs and He is also a good player and has taken " +wickets+ " wickets \n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
