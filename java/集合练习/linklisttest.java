import java.util.*;
public class linklisttest
{
   public static void main(String[]args)
   {
      List<String> staff=new LinkedList<String>();
      staff.add("a");
      staff.add("b");
      staff.add("c");
      Iterator iter=staff.iterator();
      String first=(String)iter.next();
      iter.remove();
      String second=(String)iter.next();
      ListIterator<String> iter1=staff.listIterator();
      ListIterator<String> iter2=staff.listIterator();
      //System.out.println(iter1.hasPrevious());
       
      System.out.println(staff.get(1));
      
      iter1.next();
      iter1.remove();
      //iter2.next();//抛出一致性错误异常
      iter1.add("d");
      iter1.add("e");
      iter1.previous();
      iter1.set("g");
        while(iter1.hasPrevious())
          {
      	    System.out.println(iter1.previous()+"|");
          }
      for (String  e:staff) {
      	System.out.println(e);
      	
      }
   }
	
}