import java.util.*;
import java.lang.*;
public class StringFirstLastPutMap
{
	public static void main(String[]ag)
	{
      //String []test=new String[100];
     String [] test={"code", "bug"};
      Map<String,String> tt=pairs(test);

  
      for(Map.Entry m:tt.entrySet())
      {
      	System.out.println(m);
      }

	}

	public static Map<String,String> pairs(String []strings)
    {
    	//first char as key,last char as value;
        Map<String, String> map=new HashMap<String, String>();
              for(String s:strings)
                     {
                       char a[]=s.toCharArray();
                       map.put(""+a[0],""+a[s.length()-1]);
                     }
              return map;
    }

    
}