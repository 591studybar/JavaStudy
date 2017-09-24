import java.util.*;
public class ArrayListRemoveExample
{
	public static void main(String[]args)
	{
       ArrayList<String> ar=new ArrayList<>();
       ar.add("aa");
       ar.add("bb");
       ar.add("cc");
       ar.add("dd");
       ar.add("ee");
       ar.add("ff");
       ar.add("gg");
       ar.add("hh");

       System.out.println("the array is :"+ar);

       ar.remove(1);//return  delete the value 
       System.out.println(ar.remove(2));

       ar.remove("bb");//return false and true

       System.out.println("remove after the array:"+ar);
	}
}