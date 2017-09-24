import java.util.*;
public class HashSetExample
{
	public static void main(String[]ar)
	{
       HashSet<String> hset=new HashSet<>();
       hset.add("Apple");
       hset.add("Mango");
       hset.add("Grapes");
       hset.add("Orange");
       hset.add("Fig");
       
       System.out.println(hset);

       hset.add("Apple");
       hset.add("Mango");

       System.out.println(hset);
       hset.add(null);
       hset.add(null);
       hset.add(null);

       System.out.println(hset);

       Iterator it=hset.iterator();
       while(it.hasNext())
       	System.out.println(it.next());

       for(String s:hset)
       	System.out.println(s);

       String str[]=new String[hset.size()];
       hset.toArray(str);
      
       for (int i=0;i<str.length;i++) {
       System.out.println(str[i]);
       }

      
	}
}