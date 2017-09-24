import java.util.*;

public class LinkedHashSetExample
{
    public static void main(String[]a){

   LinkedHashSet<String> lhset=new LinkedHashSet<>();
   lhset.add("A");
   lhset.add("B");
   lhset.add("C");
   lhset.add("D");
   lhset.add("E");
   lhset.add("F");

   System.out.println(lhset);

   ArrayList<String> tt=new ArrayList<>();
   tt.add("hh");
   tt.add("ll");
   tt.add("mm");
   tt.add("qq");
   
   LinkedHashSet<String> ls=new LinkedHashSet<>(tt);
   ls.add("A");
   ls.add("B");
   ls.add("C");
   System.out.println(ls);
   ls.remove("A");
   ls.add("D");
   System.out.println(ls);

	}
}