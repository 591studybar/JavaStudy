import java.util.*;

public class Dubling
{
	public static void main(String []ars)
	{
       List<Integer> l=new ArrayList<Integer>();
       l.add(1);
       l.add(2);
       l.add(3);
       for (Integer n:l ) {
       	System.out.println(n);
       }
      l=doubling(l);
      for (Integer n:l ) {
       	System.out.println(n);
       }

	}

	public static List<Integer> doubling(List<Integer> nums)
	{
		     nums.replaceAll(n -> n * 2);
             return nums;
	}
}