import java.util.*;

public class ArrayListDescOrederExample
{
	public static void main(String[]args)
	{
        ArrayList<String> arraylist=new ArrayList<>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");


        System.out.println("Before sorting:");
        for(String str:arraylist)
            System.out.println(str);


        Collections.sort(arraylist,Collections.reverseOrder());

        System.out.println("ArrayList in descending order:");
        for(String str:arraylist)
            System.out.println(str);

        Collections.sort(arraylist);
       
        System.out.println("ArrayList in Ascending order:");
        for(String str:arraylist)
            System.out.println(str);

	}
}