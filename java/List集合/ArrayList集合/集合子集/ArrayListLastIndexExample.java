import java.util.*;
public class ArrayListLastIndexExample
{
	public static void main(String[]args)
	{
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(88);
        al.add(9);
        al.add(17);
        al.add(17);
        al.add(9);
        al.add(17);
        al.add(91);
        al.add(27);
        al.add(1);
        al.add(17);
        al.add(14);

        System.out.println("Last occurrence of element 1:"+al.lastIndexOf(1));
        System.out.println("Last occurrence of element 9:"+al.lastIndexOf(9));
        System.out.println("Last occurrence of element 17:"+al.lastIndexOf(17));
        System.out.println("Last occurrence of element 91:"+al.lastIndexOf(91));
        System.out.println("Last occurrence of element 88:"+al.lastIndexOf(88));

        System.out.println("the first element is:"+al.get(0));
        System.out.println("the second element is:"+al.get(1));

        Iterator it=al.iterator();
        while(it.hasNext())
        {
          System.out.println("the element is:"+it.next());
        }

        int count=0;
        while(al.size()>count)
        {
          System.out.println("the element is:"+al.get(count));
          count++;
        }


	}
}