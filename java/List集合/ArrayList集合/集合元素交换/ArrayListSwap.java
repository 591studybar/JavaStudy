import java.util.*;
public class ArrayListSwap
{
	public static void main(String a[])
	{
        ArrayList<String> al=new ArrayList<String>();
        al.add("Sachin");
        al.add("Rahul");
        al.add("Saurav");
        al.add("Kapil");
        al.add("Vinod");

        System.out.println("ArrayList before Swap:");
        for(String temp:al){
            System.out.println(temp);
        }

        Collections.swap(al,1,4);

        System.out.println("ArrayList after Swap:");
        for(String temp:al){
         System.out.println(temp);
        }
	}
}