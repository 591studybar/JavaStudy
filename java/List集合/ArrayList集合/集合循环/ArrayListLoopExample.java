import java.util.*;

public class ArrayListLoopExample
{
	public static void main(String[]args)
	{

      ArrayList<String> arrlist=new ArrayList<>();
      arrlist.add("1111");
      arrlist.add("2222");
      arrlist.add("3333");
      arrlist.add("4444");

      //for loop for Iterating Arraylist

      System.out.println("For Loop1");
      for(int counter=0;counter<arrlist.size();counter++)
          System.out.println(arrlist.get(counter));


      //advance loop
      System.out.println("For loop2");
      for(String s:arrlist)
      	System.out.println(s);

      //while loop

      System.out.println("while loop3");
      int counter=0;
      while(arrlist.size()>counter)
      {
      	System.out.println(arrlist.get(counter));
      	counter++;
      }

      //the last loop :iterator
      System.out.println("iterator loop4:");
      Iterator it=arrlist.iterator();
      while(it.hasNext())
      {
        System.out.println(it.next());
      }


       //using enumration interface 

        Enumeration<String> e=Collections.enumeration(arrlist);
        System.out.println("ArrayList elements:");
        while(e.hasMoreElements())
        	System.out.println(e.nextElement());





	}
}