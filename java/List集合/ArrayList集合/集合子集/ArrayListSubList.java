import java.util.*;

public class ArrayListSubList
{
	public static void main(String[]ags)
	{
      ArrayList<String> ar=new ArrayList<>();
      ar.add("Steve");
      ar.add("Justin");
      ar.add("Ajeet");
      ar.add("John");
      ar.add("Arnold");
      ar.add("Chaitanya");

      System.out.println("Orginal ArrayList Content:"+ar);

      ArrayList<String> al2=new ArrayList<>(ar.subList(1,4));

      System.out.println("SubList stored in ArrayList:"+al2);

      List<String> list=ar.subList(1,4);

      System.out.println("SubList stored in List:"+list);

	}
}