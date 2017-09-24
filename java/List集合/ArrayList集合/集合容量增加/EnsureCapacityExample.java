import java.util.*;
public class EnsureCapacityExample
{
	public static void main(String[]a){
	ArrayList<String> al=new ArrayList<String>(4);
	al.add("hi");
	al.add("Hello");
	al.add("bye");
	al.add("GM");
    System.out.println(al.size());
	
     al.add("jj");
     al.add("System");

     System.out.println(al.size());
      al.ensureCapacity(100);
      al.add("aaa");
      System.out.println(al.size());
    for(String tmp:al)
     System.out.println(tmp);
     }
}