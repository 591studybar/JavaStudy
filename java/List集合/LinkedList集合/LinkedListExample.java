import java.util.*;
public class LinkedListExample
{
	public static void main(String[]a)
	{
        LinkedList<String> linkedlist=new LinkedList<>();
        linkedlist.add("hello");
        linkedlist.add("hi");
        linkedlist.add("test");
        linkedlist.add("test1");
        linkedlist.add("test2");
        linkedlist.add("test1");
        linkedlist.add("test2");
        //Iterator it=linkedlist.iterator();
        System.out.println("Linked List content:"+linkedlist);

        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("Linkedlist content after addition:"+linkedlist);
 
        Object firstvar=linkedlist.get(0);
        System.out.println("First element:"+firstvar);
        linkedlist.set(0,"changed first item");
        Object firstvar2=linkedlist.get(0);
        System.out.println("First element after update by set method:"+firstvar2);

        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("Linkedlist after deletion of first and last element"+linkedlist);

        linkedlist.add(0,"Newly added item");
        linkedlist.remove(2);
        System.out.println("final content"+linkedlist);
         
        linkedlist.remove();
        linkedlist.remove();
        System.out.println("the linklist is:"+linkedlist);

        linkedlist.removeFirstOccurrence("test1");
        System.out.println("the remove the test1 item is"+linkedlist);
        
        linkedlist.removeLastOccurrence("test2");
        System.out.println("the remove the last test2 item is:"+linkedlist);
         
        linkedlist.offerFirst("New element");
        
        Iterator il=linkedlist.listIterator();
        for (String s:linkedlist) {
        	System.out.println(s);
        }
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getLast());
       
        linkedlist.remove("hello");
        System.out.println(linkedlist);
        linkedlist.remove(1);
        System.out.println(linkedlist);
        linkedlist.clear();
        
	}
}