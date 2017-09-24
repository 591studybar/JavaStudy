import java.util.*;
import java.util.ListIterator;
public class LinkListItarator
{
	public static void main(String[]a)
	{
      LinkedList<String> linkedlist=new LinkedList<>();
      linkedlist.add("A");
      linkedlist.add("B");
      linkedlist.add("C");
      linkedlist.add("D");
      linkedlist.add("E");
      linkedlist.add("F");
      Iterator it=linkedlist.iterator();
      System.out.println("Front iterator:");

      while(it.hasNext())
          System.out.println(it.next());
      //reverse order 
      Iterator iter =linkedlist.descendingIterator();
      System.out.println("reverse the iterator");
      while(iter.hasNext())
      System.out.println(iter.next());

      ListIterator lt=linkedlist.listIterator();
      System.out.println("Forward iteration:");

      while(lt.hasNext())
          System.out.println(lt.next());

      System.out.println("\nBackWard iteration:");
      while(lt.hasPrevious())
           System.out.println(lt.previous());



	}
}