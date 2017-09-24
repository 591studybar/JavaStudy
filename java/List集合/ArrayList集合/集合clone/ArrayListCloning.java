import java.util.*;
public class ArrayListCloning
{
	public static void main(String[]a)
	{
      ArrayList<String> al=new ArrayList<>();
      al.add("Apple");
      al.add("Orange");
      al.add("Mango");
      al.add("Grapes");
      System.out.println("ArraList:"+al);

      ArrayList<String> al2=(ArrayList<String>)al.clone();
      System.out.println("Shallow copy of ArrayList:"+al2);


      al.add("Fig");
      System.out.println(al);
      System.out.println(al2);
      
      al.remove("Orange");
      System.out.println(al);
      System.out.println(al2);

      al2.add("Pear");
      System.out.println(al);
      System.out.println(al2);

	}
}