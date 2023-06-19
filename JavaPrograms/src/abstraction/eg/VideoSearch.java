package abstraction.eg;

public class VideoSearch extends Google {

	

	public int display(int a)
	{
		a=+10;
		return a;//abstract method should be without body
	}
	
	
	public void search()
	{
		System.out.println("all images searched");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
VideoSearch obj1=new VideoSearch();
obj1.input();
int output;
obj1.search();
output=obj1.display(20);
System.out.println("number displaying :" +output);



	}

}
