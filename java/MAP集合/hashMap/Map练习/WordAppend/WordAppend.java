import java.util.*;
import java.lang.*;
public class WordAppend
{
	public static void main(String[]ag)
	{
      String [] test={"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"};
      String tt=wordAppend(test);
      
      	System.out.println(tt);
  
      
	}

	public static String wordAppend(String[]strings)
	{    String str="";
         Map<Integer,String> map=new TreeMap<Integer,String>();
         for(int i=0;i<strings.length;i++)
         	{   int count=0;
         		
         	    for(int j=0;j<strings.length;j++)
         	     {
                   if(strings[i]==strings[j])
                      count++;
         	      }
         	     map.put(count,strings[i]);
            }
      for(Map.Entry m:map.entrySet())
      {
      	if (((Integer)m.getKey())>=2) {
      		for(int i=0;i<(Integer)m.getKey()/2;i++)
                 str+=(String)m.getValue();
      	}
      }
            return str;
	}
}