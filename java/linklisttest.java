public class linklisttest
{
   public static void main(String[]args)
   {
      List<String> staff=new LinkedList<>();
      staff.add("a");
      staff.add("b");
      staff.add("c");
      Iterator iter=staff.iterator();
      String first=iter.next();
      string second=iter.next();
      iter.remove();
   }
	
}