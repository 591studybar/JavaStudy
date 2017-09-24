import java.util.*;

public class ListToArrayListExample
{
	public static void main(String[]args)
	{
        
        ArrayList<String> al=new ArrayList<String>();
        al.add("Text 1");
        al.add("Text 2");
        al.add("Text 3");

        System.out.println("ArrayList Element are:"+al);

        List<String> list =new ArrayList<String>();
        list.add("Text 4");
        list.add("Text 5");
        list.add("Text 6");

        al.addAll(list);
        System.out.println("Update ArrayList Elements:"+al);

        al.addAll(1,list);

        System.out.println("Update ArrayList insert 2 posion: "+al);

        List list1 =new ArrayList();
        List newlist= new ArrayList();
        list1.addAll(newlist);
        System.out.println(list1);

        List list2=null;
        List newlist2=null;
        list2.addAll(newlist2);
        System.out.println(list2);





	}
}