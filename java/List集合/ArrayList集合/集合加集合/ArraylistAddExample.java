import java.util.*;
public class ArraylistAddExample
{
	public static void main(String[]args)
	{

	    ArrayList<String> al=new ArrayList<String>();
	    al.add("Hi");
	    al.add("hello");
	    al.add("String");
	    al.add("Test");
	    System.out.println("ArrayList before addall:"+al);

	    ArrayList<String> a2=new ArrayList<String>();
	    a2.add("Text1");
	    a2.add("Text2");
	    a2.add("Text3");
	    a2.add("Text4");

	    al.addAll(a2);
	    System.out.println("ArrayLisst after addALl;"+al);

	}
}