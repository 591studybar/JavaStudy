import java.util.*;
public class ArrayLitToArray
{
	public static void main(String[]a)
	{
	  //first
      ArrayList<String> ar=new ArrayList<>();
      ar.add("hello");
      ar.add("hoo");
      ar.add("world");
      ar.add("test");
       
      String arr[]=new String[ar.size()];

      for(int i=0;i<ar.size();i++)
          arr[i]=ar.get(i);

      for(String s:arr)
          System.out.println(s);

     //second
      ArrayList<String> al=new ArrayList<>();
      al.add("hi");
      al.add("heh");
      al.add("test");
      al.add("world");
      al.add("go");

      String tes[]=al.toArray(new String[al.size()]);

      for(String k:tes)
      	System.out.println(k);


	}
}