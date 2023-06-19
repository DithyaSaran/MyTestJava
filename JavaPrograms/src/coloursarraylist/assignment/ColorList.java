package coloursarraylist.assignment;
import java.util.*;
public class ColorList {
	
		ArrayList<String> obj=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		
	
	public void input()
	{
	
	obj.add("Violet");
	obj.add("Indigo");
	obj.add("Blue");
	obj.add("Green");
	obj.add("Yellow");
	obj.add("Orange");
	obj.add("Red");
	
	}
	
	public void collect()
	{
		System.out.println("COLLECTIONS:");
		System.out.println("Colours : " +obj);
	}
	
	
	public void retrieve()
	{
		
		System.out.println("\n\nRETRIEVAL OF AN ELEMENT");
		System.out.println("Enter index of element to retrieve ");
		int element=s.nextInt();
		System.out.println("Retrieved element : " +obj.get(element));
	}
	
	public void iteration()
	{
		System.out.print("\nITERATED ELEMENTS\n");
		Iterator<String> var=obj.iterator();
		
		while(var.hasNext())
		{
			System.out.print(var.next()+ " ");
		}
	}
	public void remove()
	{
		System.out.println("\nREMOVAL OF ELEMENT");
		System.out.println("Enter index of element to remove");
		int rem=s.nextInt();
		obj.remove(rem);
		System.out.println("After Removal :" +obj);
	}
	
	public void search()
	{
		System.out.println("\nSEARCHING ELEMENT");
		System.out.println("Enter element to search");
		s.nextLine();
		String col=s.nextLine();
		if(obj.contains(col))
		{
	
			System.out.println("Element found in array list");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		ColorList obj1=new ColorList();
		obj1.input();
		obj1.collect();
		obj1.iteration();
		obj1.retrieve();
		obj1.remove();
		obj1.search();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
