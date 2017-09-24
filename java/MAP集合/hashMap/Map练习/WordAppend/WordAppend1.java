import java.util.*;
import java.lang.*;
public class WordAppend1
{
	public static void main(String[]ag)
	{
      String [] test={"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"};
      String tt=wordAppend(test);
      
      	System.out.println(tt);
  
      
	}

	public static String wordAppend(String[]strings)
	{    StringBuilder str=new StringBuilder();
         Map<String,Integer> map=new TreeMap<String,Integer>();
         for(String s:strings)
           {
            if(!map.containsKey(s)){
              map.put(s,1);
            
           }else
           {
            int count=map.get(s);
            map.put(s,count+1);
            if(map.get(s)==2)
            {
              str.append(s);
              map.remove(s);
            }

           }
            }
      
            return str+"";
	}
}