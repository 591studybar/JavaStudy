import java.util.*;
import java.lang.*;
public class FirstCharMap
{
	public static void main(String[]ag)
	{
      String [] test={"code", "bug","code","bug","te","code","te","ss","bc","ss","aa"};
      Map<String,String> tt=firstChar(test);

  
      for(Map.Entry m:tt.entrySet())
      {
      	System.out.println(m);
      }
	}

	public static Map<String,String> firstChar(String[]strings)
	{
		 Map<String,String> map=new TreeMap<String,String>();
         
         for(int i=0;i<strings.length;i++)
         	{   StringBuilder st=new StringBuilder();
         		char []s=strings[i].toCharArray();
         		//st.append(strings[i]);
         		for(int j=0;j<strings.length;j++)
         		{
         			char []a=strings[j].toCharArray();
         			if(s[0]==a[0])
         				st.append(strings[j]);

         		}
         			map.put(""+s[0],st+"");
             }   
         return map;
	}
}
