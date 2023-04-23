package hierarchical.cricket;

public class Player3 extends Cricket{
	int catches;
	
	public void play3(String name, int matchesplay, int runscore,int catches)
	{
		this.name=name;
		this.matchesplay=matchesplay;
		this.runscore=runscore;
		this.catches=catches;
	}
	public void print()
	{
	System.out.println(name + " played " +matchesplay+ " matches and scored " +runscore+ " runs and He also keep wickets and has taken " +catches+ " catches \n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
