import java.util.*;
public class TreeMapExample
{
	//TreeMap has sort feature
	public static void main(String[]a)
	{
	  TreeMap<Integer,String> tmap=new TreeMap<>();

	  tmap.put(1,"hell0");
	  tmap.put(29,"hell.");
	  tmap.put(90,"hello");
	  tmap.put(8,"hell`");
	  tmap.put(2,"hell'");

	  Set set=tmap.entrySet();
	  Iterator it=set.iterator();
	  while(it.hasNext())
	  {
	  	Map.Entry m=(Map.Entry)it.next();
	  	System.out.println("the key is :"+m.getKey()+" the value is:"+m.getValue());
	  }

	}
}