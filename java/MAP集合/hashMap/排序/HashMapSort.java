import java.util.*;
public class HashMapSort
{
	public static void main(String[]args)
	{
      
      HashMap<Integer,String> hmap =new HashMap<>();
      hmap.put(11,"9999");
      hmap.put(44,"4444");
      hmap.put(22,"2222");
      hmap.put(55,"5555");
      hmap.put(33,"3333");
      hmap.put(99,"1111");
      hmap.put(77,"7777");

      System.out.println("Before sorting:");
      for(Map.Entry m:hmap.entrySet())
      	 System.out.println("the key is:"+m.getKey()+"the values is:"+m.getValue());

     Map<Integer,String> map=new TreeMap<Integer,String>(hmap);

     System.out.println("after sorting:");
     for(Map.Entry m:map.entrySet())
     	System.out.println("the key is:"+m.getKey()+"the values is:"+m.getValue());

     List list=new ArrayList(hmap.entrySet());
     Collections.sort(list,new Comparator(){
     	public int compare(Object a,Object b)
     	{
     	   String s=(String)(((Map.Entry)a).getValue());
     	   String t=(String)(((Map.Entry)b).getValue());
           return ((Comparable)((Map.Entry)a).getValue()).compareTo(((Map.Entry)b).getValue());
     	}
     });
     
     System.out.println(list);
     System.out.println("after sorting:");

     for(Map.Entry m:hmap.entrySet())
     	System.out.println("the key is:"+m.getKey()+"the values is:"+m.getValue());
      	

    List list1=new ArrayList(hmap.entrySet());
     Collections.sort(list1,new Comparator(){
     	public int compare(Object a,Object b)
     	{
     	   String s=(String)(((Map.Entry)a).getValue());
     	   String t=(String)(((Map.Entry)b).getValue());
           return s.compareTo(t);
     	}
     });
     
     System.out.println(list1);
     System.out.println("after sorting:");

     Iterator it=list1.iterator();
     while(it.hasNext())
     {
         Map.Entry s=(Map.Entry)it.next();
         System.out.println("the key is :"+s.getKey()+" the value is:"+s.getValue());

     }

    


	}
}