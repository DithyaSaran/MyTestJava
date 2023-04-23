package hierarchical.cricket;

public class Cricket {
	String name;
	int matchesplay;
	int runscore;
	
	public void play(String name, int matchesplay, int runscore)
	{
		this.name=name;
		this.matchesplay=matchesplay;
		this.runscore=runscore;
			
	}
	
	/*public void print()
	{
	System.out.println(name + "played" +matchesplay+ "matches and scored " +runscore+ "runs");
	
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player1 obj1=new Player1();
		Player2 obj2=new Player2();
		Player3 obj3=new Player3();
		obj1.play1("Sachin",250, 11324,100,125);
		obj1.print();
		obj2.play2("Dhoni", 153, 6021,120);
		obj2.print();
		obj3.play3("Sewang", 110, 4341,100);
		obj3.print();
	}
	
	}
	
