package abstraction.eg;

public class ImageSearch extends Google{
	
	public void search()
	{
		System.out.println("Images Searching ");
		
	}
	
	public void song()
	{
		System.out.println("Songs Playig"); 
	}
	
	public int display(int num)
	{
		int n=num;
		return n;
	}
	
public static void main(String[] args) {
	ImageSearch obj=new ImageSearch();
	obj.input();
	obj.search();
	obj.song();
	int res;
	res=obj.display(100);
	System.out.println("Displaying : " +res);

	
	
}
	
}
