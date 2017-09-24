import java.util.*;
public class LinkListPoll
{
	public static void main(String[]a)
	{
       LinkedList<String> list=new LinkedList<>();
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       list.add("E");

       System.out.println("LinkedList before:"+list);

       System.out.println("Element removed:"+list.poll());
       System.out.println("LinkedList after:"+list);

       System.out.println("Element removed:"+list.pollFirst());
       System.out.println("LinkedList after:"+list);

       System.out.println("Element removed:"+list.pollLast());
       System.out.println("LinkedList after:"+list);

       System.out.println("Element peeked:"+list.peek());
       System.out.println("Element peekfirst:"+list.peekFirst());
       System.out.println("Element peekLast:"+list.peekLast());

       System.out.println("LinkedList after:"+list);

	}
}