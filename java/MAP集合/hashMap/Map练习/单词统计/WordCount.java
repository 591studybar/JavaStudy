import java.util.*;
import java.lang.*;
public class WordCount
{
	public static void main(String[]ag)
	{
      String [] test={"code", "bug","code","bug","te","code","te","ss","bc","ss","aa"};
      Map<String,Integer> tt=wordCount(test);

  
      for(Map.Entry m:tt.entrySet())
      {
      	System.out.println(m);
      }
	}

	public static Map<String,Integer> wordCount(String[]strings)
	{
		int count=0;
		Map<String,Integer> st=new TreeMap<String,Integer>();
		for(int i=0;i<strings.length;i++)
			{   
				count=0;
				for(int j=0;j<strings.length;j++)
				if(strings[i].equals(strings[j]))
				{
                  count++;
				}
				st.put(strings[i],count);
            }
            return st;
	}
}