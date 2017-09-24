import java.util.*;
public class LinkListPushAndPop
{
	public static void main(String[]args)
	{
      LinkedList<String> linkedlist=new LinkedList<String>();
      linkedlist.add("A");
      linkedlist.add("B");
      linkedlist.add("C");
      linkedlist.add("D");
      linkedlist.add("E");
      linkedlist.add("F");
      System.out.println("the linkedlist is:"+linkedlist);

      linkedlist.push("G");

      System.out.println("push after linkedlist:"+linkedlist);

      linkedlist.pop();
      linkedlist.pop();

      System.out.println("pop after linkedlist"+linkedlist);
     

	}
}