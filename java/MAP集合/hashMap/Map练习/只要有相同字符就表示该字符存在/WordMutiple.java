import java.util
public class WordMutiple
{
	public static void main(String[]args)
	{
        String test[]={"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"};
        Map<String,Boolean> map1 =new TreeMap<String,Boolean>();
        map1=wordMutiple(test);
        System.out.println(map1);
	}

	public static Map<String,Boolean> wordMutiple(String[]strings)
	{
		Map<String,Boolean> map=new TreeMap<String,Boolean>();
		for(String s:strings)
			if(!map.containsKey(s))
				map.put(s,false);
			else
			    map.put(s,true);
	    return map;
	}
}