import java.util.*;

public class ArrayListExample
{
	public static void main(String args[])
	{ 

		//ArrayList<String> obj=new ArrayList<>();
		List<String> obj=new ArrayList<>();
		obj.add("1111");
		obj.add("2222");
		obj.add("3333");
		obj.add("4444");
		obj.add("5555");
		obj.add("6666");
		obj.add("1111");

		System.out.println("Currently the array list has following elemet:"+obj);
         
         obj.add(0,"7777");
         obj.add(1,"8888");
          
         obj.remove("3333");
         obj.remove("4444");

          System.out.println("Currently the array list has following elemet:"+obj);
          
          obj.remove(1);

          System.out.println("Currently the array list has following elemet:"+obj);
          
          obj.set(2,"9999");
          System.out.println("Currently the array list has following elemet:"+obj);
           
          int pos=obj.indexOf("1111");
          System.out.println(pos);
           
          int last=obj.lastIndexOf("1111"); 
          System.out.println(last);

          for(String s:obj)
          {
          	System.out.println(s);
          }

          System.out.println(obj.size());

          String a = obj.contains("9999")?"a":"b";
          obj.clear();
          System.out.println("Currently the array list has following elemet:"+obj);

	}
}