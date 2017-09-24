import java.util.*;
public class TreeSetTest
{
	public static void main(String[]args)
	{
       SortedSet<String> sorter=new TreeSet<String>();
       sorter.add("Bob");
       sorter.add("Army");
       sorter.add("Carl");
       for(String s:sorter)
       System.out.println(s);

   /////
    SortedSet<Item> parts=new TreeSet<>();
    parts.add(new Item("1111",1234));
    parts.add(new Item("2222",5678));
    parts.add(new Item("3333",2342));
    System.out.println(parts);

    NavigableSet<Item> sortByDescription=new TreeSet<>(Comparator.comparing(Item::getDescripton));
    sortByDescription.addAll(parts);
    System.out.println(sortByDescription);

	}
}