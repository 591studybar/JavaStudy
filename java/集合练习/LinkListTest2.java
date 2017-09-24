import java.util.*;
public class LinkListTest2
{
	public static void main(String[]args)
	{
       List<String> a=new LinkedList<String>();
       a.add("hello");
       a.add("baby");
       a.add("i love you");

       List<String> b=new LinkedList<String>();
       b.add("Bob");
       b.add("army");
       b.add("france");
       b.add("gloria");

       ListIterator<String> alter=a.listIterator();
       Iterator<String> blter=b.iterator();

       while(blter.hasNext())
       {
         //System.out.println(blter.next());
         if (alter.hasNext()) {
         	alter.next();
         }
         alter.add(blter.next());
       }

       System.out.println(a);
       System.out.println(b);
        
       blter =b.listIterator();
       while(blter.hasNext())
       {
       	  blter.next();
       	  if(blter.hasNext())
       	  {
       	  	blter.next();
       	    blter.remove();
       	  }
       }

       System.out.println(b);

       a.removeAll(b);

       System.out.println(a);


	}
}