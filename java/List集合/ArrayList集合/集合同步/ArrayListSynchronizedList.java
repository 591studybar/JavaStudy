import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSynchronizedList
{
	public static void main(String[]args)
	{
       List<String> syncal=Collections.synchronizedList(new ArrayList<String>());
       syncal.add("pen");
       syncal.add("NoteBook");
       syncal.add("Ink");

       System.out.println(syncal);
       System.out.println("Iterating synchronized ArayList:");

       synchronized(syncal)
       {
        Iterator<String> iterator =syncal.iterator();
        while(iterator.hasNext())
        {
          System.out.println(iterator.next());
        }
       }

       syncal.add("ss");

       System.out.println(syncal);


       CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>();
       al.add("pen");
       al.add("NoteBook");
       al.add("Ink");

       for(String s:al)
       	System.out.println(s);
       System.out.println("Displaying synchronized ArayList elments:");
       Iterator<String> it=al.iterator();
       while(it.hasNext())
       	System.out.println(it.next());

	}
}