import java.util.*;

public class ArrayListSortExamle
{
	public static void main(String[]args)
	{
      
      ArrayList<String> arrlist=new ArrayList<>();
      arrlist.add("India");
      arrlist.add("US");
      arrlist.add("China");
      arrlist.add("Denmark");
      arrlist.add("Japanese");

      System.out.println("Before Sorting:");
      for (String s:arrlist ) {
      	System.out.println(s);
      }

      Collections.sort(arrlist);

      System.out.println("After Sorting:");
      for (String s:arrlist) {
      	System.out.println(s);
      }




      ///int sort
      ArrayList<Integer> arrl=new ArrayList<>();
      arrl.add(1);
      arrl.add(3);
      arrl.add(5);
      arrl.add(2);
      arrl.add(4);
      arrl.add(7);
      arrl.add(6);
      arrl.add(5);
      System.out.println("Before Sorting");
      for (int  v:arrl) {
      	System.out.println(v);
      }

      Collections.sort(arrl);
      
      System.out.println("After Sorting");
      for (int v:arrl ) {
      	System.out.println(v);
      }


	}
}