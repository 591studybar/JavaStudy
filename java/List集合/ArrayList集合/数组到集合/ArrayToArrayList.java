import java.util.*;
public class ArrayToArrayList
{
	public static void main(String[]a)
	{
      String ar[]=new String[10];
      for(int i=0;i<ar.length;i++)
          ar[i]=""+i;
      for(String t:ar)
      System.out.println(t);
      //first
      ArrayList<String> al=new ArrayList<String>();
      //al.addAll(ar);
      for(int i=0;i<ar.length;i++)
      	al.add(ar[i]);
      System.out.println(al);
     
     //second
      ArrayList<String> arr=new ArrayList<String>(Arrays.asList(ar));
      for(String tmp:arr)
      	System.out.println(tmp);

      //third
      ArrayList<String> ap=new ArrayList<String>();
      Collections.addAll(ap,ar);
      for(String s:ap)
      	System.out.println(s);







	}
}