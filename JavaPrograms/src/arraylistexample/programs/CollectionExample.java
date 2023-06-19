package arraylistexample.programs;
import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Pineapple");
		obj.add("Plum");
		obj.add("Grapes");
		
		System.out.println("Fruits :" +obj);
		
		Collections.sort(obj);      //sorted array
		System.out.println("Sorted List :" +obj);
	
		obj.remove(2);        //remove from the list
		System.out.println("After removing: " +obj);
		System.out.println("Lenth of array list : "+obj.size() );
		
		/*for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));    //showing corresponding values of index
		}*/
		
		/*for(String element:obj)   //for each loop
		{
			System.out.println(element);
		}*/
		String veg;
		Scanner s=new Scanner(System.in);
		System.out.println(" enetr veg");
		veg=s.nextLine();
		
		System.out.println(" veg " +obj.contains(veg));
		
		Iterator<String> var=obj.iterator();   //iterator class
		while(var.hasNext())
		{
			System.out.println(var.next());
		}
	}

}
