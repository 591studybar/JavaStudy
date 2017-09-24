import java.util.*;
public class Allswap2
{
	public static void main(String[]args)
	{
        String test[]={"ax", "bx", "ay", "by", "ac", "aj", "cx", "cy"};
        Map<String,Integer> map1 =new HashMap<String,Integer>();
        
        String [] xx=null;
        xx=allSwap(test);
        for(int i=0;i<xx.length;i++)
        System.out.println(xx[i]);
       
        

	}   


	
 
public static String[] allSwap(String[] strings) {
             Map<String, Integer> map = new HashMap<>();
                for (int i=0; i<strings.length; i++) {
                 String key = strings[i].substring(0, 1);
                  if (map.containsKey(key)) {
                    int match = map.get(key);
                    if(match!=-1){
                    String temp = strings[match];  // swap strings at match/i
                    strings[match] = strings[i];
                    strings[i] = temp;
                    }
                    map.put(key,-1);
                     //map.remove(key);  // so this old one won't match anything
                   }
                  else {
                        map.put(key, i);
                       }
                   }
             return strings;
}

}