import java.util.*;

public class VectorExample
{
	public static void main(String[]a)
	{
      Vector<String> v=new Vector<String>();
      v.add("A");
      v.add("B");
      v.add("C");
      v.add("D");

      v.remove(2);

      v.remove("B");

      for (String s:v) {
      	System.out.println(s);
      }

      System.out.println("the default size Vector is:"+v.size());
      System.out.println("the Vector default capacity is:"+v.capacity());

      v.addElement("E");
      v.addElement("F");
      v.addElement("G");
      v.addElement("H");
      v.addElement("I");
      
      System.out.println("the default size Vector is:"+v.size());
      System.out.println("the Vector default capacity is:"+v.capacity());
      
      v.addElement("G");
      v.addElement("H");
      v.addElement("I");
      v.addElement("G");
      v.addElement("H");
      v.addElement("I");
       
      System.out.println("the default size Vector is:"+v.size());
      System.out.println("the Vector default capacity is:"+v.capacity());
        
       Vector<Integer> b=new Vector<>(2);
       b.addElement(1);
       b.addElement(2);
       b.addElement(3);
       Enumeration en=b.elements();
       System.out.println("\nELements are:");
       while(en.hasMoreElements())
       	    System.out.println(en.nextElement()+"");

       	List sublist=b.subList(1,2);
       	System.out.println(sublist);
       

	}
}