import java.util.*;
public class MapTest
{
	public static void main(String[]args)
	{
      Map<String,Employee> staff=new HashMap<>();
      staff.put("144-25-5464",new Employee("111",11));
      staff.put("567-23-2546",new Employee("222",22));
      staff.put("345-32-2345",new Employee("333",33));
      staff.put("567-45-2343",new Employee("444",44));

      System.out.println(staff);//打印员工

      staff.remove("567-23-2546");

      staff.put("789-66-8912",new Employee("5555",11));

      System.out.println(staff);

      System.out.println(staff.get("144-25-5464"));
      staff.put("144-25-5464",new Employee("6666",66));

      System.out.println(staff);
    
      staff.forEach((k,v)->System.out.println("key="+k+",value="+v));
      
      for(Map.Entry<String,Employee> entry:staff.entrySet())
      {
      	String k=entry.getKey();
      	Employee v=entry.getValue();
      	System.out.println("the k is"+k+"the v is"+v);

      }
    
      Set<String> keys=staff.keySet();
      for(String key:keys)
      {
      	System.out.println(key);
      }

      
	}
}