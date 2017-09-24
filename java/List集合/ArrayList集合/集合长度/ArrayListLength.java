import java.util.*;

public class ArrayListLength
{
	public static void main(String[]args)
	{
      ArrayList<Integer> al=new ArrayList<Integer>();
      System.out.println("Initial size:"+al.size());
      al.add(1);
      al.add(2);
      al.add(3);
      al.add(4);
      al.add(5);
      al.add(6);
      al.add(7);
      al.add(8);
      System.out.println("Size after few addition:"+al.size());
      al.remove(0);
      al.remove(1);
      System.out.println("Size after remove operation:"+al.size());
      System.out.println("Final ArrayList:");
      for(int num:al)
      {
        System.out.println(num);
      }
	}
}