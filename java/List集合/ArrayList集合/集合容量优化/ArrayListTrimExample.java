import java.util.*;
public class ArrayListTrimExample
{
	public static void main(String[]a)
	{
       ArrayList<Integer> arraylist=new ArrayList<Integer>();
       arraylist.add(1);
       arraylist.add(2);
       arraylist.add(3);
       arraylist.add(4);
       arraylist.add(5);
       arraylist.add(6);
       arraylist.add(7);
       arraylist.add(1);
       arraylist.add(1);
       arraylist.add(1);
       arraylist.trimToSize();
       System.out.println(arraylist);

       System.out.println(arraylist.size());
	}
}