import java.util.*;
public class LinkedListLoop
{
	public static void main(String[]a)
	{
      LinkedList<String> linkedlist=new LinkedList<String>();
      linkedlist.add("Apple");
      linkedlist.add("Orange");
      linkedlist.add("Mango");
      
      //first 
      System.out.println("***For loop**");
      for(int num=0;num<linkedlist.size();num++)
      {
         System.out.println(linkedlist.get(num));
      }
     
      //second
      System.out.println("** foreach loop **");
      for(String s:linkedlist)
      	System.out.println(s);

      //third 
      System.out.println("** iterator **");
      Iterator it=linkedlist.iterator();
      while(it.hasNext())
      	System.out.println(it.next());

      //fourth
      System.out.println("** while loop **");
      int count =0;
      while(linkedlist.size()>count)
      	{
      		System.out.println(linkedlist.get(count));
      		count++;
      	}



	}
}