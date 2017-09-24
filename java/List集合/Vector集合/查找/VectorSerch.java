import java.util.*;
public class VectorSerch
{
	public static void main(String[]arg)
	{
      Vector<String> a=new Vector<String>();
      a.add("A");
      a.addElement("B");
      a.add("C");
      a.add("A");
      a.add("F");
      a.add("B");
      a.addElement("H");

      System.out.println(a);

      int first_index=a.indexOf("A");
      System.out.println("First Occurrence of part at index:"+first_index);
      
      int last_index =a.lastIndexOf("A");
      System.out.println("last occurrence of part at index:"+last_index);
	  
	  int after_index=a.indexOf("A",2);
	  System.out.println("occurrence after index 2: "+after_index);
       
      int before_index=a.lastIndexOf("A",2);
      System.out.println("occurrence before index 2:"+before_index);

 
	}
}