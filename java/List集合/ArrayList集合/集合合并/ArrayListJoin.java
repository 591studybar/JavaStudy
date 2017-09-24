import java.util.*;
public class ArrayListJoin
{

 public static void main(String a[])
 {
    ArrayList<String> arraylist1=new ArrayList<String>();
    arraylist1.add("AL1:E1");
    arraylist1.add("AL1:E2");
    arraylist1.add("AL1:E3");

    ArrayList<String> arraylist2=new ArrayList<>();
    arraylist2.add("AL2:E1");
    arraylist2.add("AL2:E2");
    arraylist2.add("AL2:E3");
    ArrayList<String> al=new ArrayList<String>();
    al.addAll(arraylist1);
    al.addAll(arraylist2);

    for(String tmp:al)
       System.out.println(tmp);
 }
	
}