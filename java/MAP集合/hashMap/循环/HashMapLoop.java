import java.util.*;
public class HashMapLoop
{
	public static void main(String[]args)
	{
        
        HashMap<Integer,String> hmap=new HashMap<>();
        hmap.put(11,"1111");
        hmap.put(22,"2222");
        hmap.put(33,"3333");
        hmap.put(44,"4444");
        hmap.put(55,"5555");
        hmap.put(66,"6666");

        //for loop
        System.out.println("For loop:");
        for(Map.Entry m:hmap.entrySet())
        	System.out.println("the key is:"+m.getKey()+" the value is:"+m.getValue());

       //iterator loop
        System.out.println("iterator loop:");
        Iterator it=hmap.entrySet().iterator();
        while(it.hasNext())
        {
           Map.Entry m=(Map.Entry)it.next();
           System.out.println("the key is:"+m.getKey()+" the value is:"+m.getValue());
        }
        
        HashMap<Integer,String> map =new HashMap<>();

        for (Map.Entry m:hmap.entrySet()) {
        	map.put((Integer)m.getKey(),(String)m.getValue());
        }
         
         System.out.println(map);
	}
}