import java.util.*;
public class HashMapExample
{
  public static void main(String[]args)
  {
     HashMap<Integer,String> map=new HashMap<>();

     map.put(12,"test");
     map.put(2,"hello");
     map.put(7,"sight");
     map.put(49,"Abjsj");
     map.put(3,"coed");

     System.out.println(map);
   

     Set set=map.entrySet();
     Iterator ite=set.iterator();
     while(ite.hasNext())
     {
     	Map.Entry mentry= (Map.Entry)ite.next();
     	System.out.println("key is:"+mentry.getKey()+"& value is:"+mentry.getValue());
     }
     
     String var=map.get(2);
     System.out.println("value at index 2 is:"+var);

     map.remove(3);
     System.out.println("map key and values after remove:");

    Iterator it=set.iterator();
     while(it.hasNext())
     {
     	Map.Entry mentry= (Map.Entry)it.next();
     	System.out.println("key is:"+mentry.getKey()+"& value is:"+mentry.getValue());
     }

     Set tt=map.keySet();
     Iterator ll=tt.iterator();
     while(ll.hasNext())
     	System.out.println("the key is "+ll.next());
      
     Collection<String> xx=map.values();
    
     System.out.println(xx);


  }
	
}