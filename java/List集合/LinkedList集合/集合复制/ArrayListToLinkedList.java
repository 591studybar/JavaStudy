import java.util.*;
public class ArrayListToLinkedList
{
	public static void main(String[]a)
	{
      List<String> linkedlist=new LinkedList<String>();
      linkedlist.add("A");
      linkedlist.add("B");
      linkedlist.add("C");
      linkedlist.add("D");
      linkedlist.add("E");
      linkedlist.add("F");
      linkedlist.add("G");

      System.out.println("the linkedlist is:"+linkedlist);

      List<String> arr=new ArrayList<>();
      arr.add("he");
      arr.add("hh");
      arr.add("ll");
      arr.add("kk");
      System.out.println("the ArrayList is :"+arr);

      linkedlist.addAll(arr);
      System.out.println("the linkedlist add after is:"+linkedlist);

      linkedlist.removeAll(arr);
      System.out.println("the linkedlist is "+linkedlist);

      linkedlist.add(4,"arr");
      System.out.println("the linkedlist is "+linkedlist);

      arr.addAll(linkedlist);
      System.out.println("the ArrayList is"+arr);
	}
}