import java.util.*;
public class AllSwap
{
	public static void main(String[]args)
	{
        String test[]={"list", "of", "words", "swims", "over", "lily", "water", "wait"};
        Map<String,Integer> map1 =new TreeMap<String,Integer>();
        
        String [] xx=null;
        xx=wordMutiple(test);
        for(int i=0;i<xx.length;i++)
        System.out.println(xx[i]);
        tt(test);
        System.out.println(test[0]+test[1]+test[2]+test[3]);
        

	}   


	public static String[] wordMutiple(String[]strings)
	{
		String []str={};
		String temp="";
		Map<String,Integer> map=new TreeMap<String,Integer>();
		for(int i=0;i<strings.length;i++)
			  {
			  	char a[]=strings[i].toCharArray();
			  	
			     if(!map.containsKey(a[0]+""))
			     	 map.put(a[0]+"",i);
			     else
			     {
			     		
			     			temp=strings[((Integer)map.get(a[0]+""))];
			     			strings[(Integer)map.get(a[0]+"")]=strings[i];
			     		    strings[i]=temp;
			     		    map.remove(a[0]+"");
			     		    map.remove(strings[i]);
			     		
			     	
			     }
			    
			   }
	    //for(int i=0;i<strings.length;i++)
	    	//map.put(strings[i],strings[i].substring(1,strings[i].length()));
        //for(map.containsKey)
	    return strings;
	}
 //reference  
public String[] allSwap(String[] strings) {
             Map<String, Integer> map = new HashMap();
                for (int i=0; i<strings.length; i++) {
                 String key = strings[i].substring(0, 1);
                  if (map.containsKey(key)) {
                    int match = map.get(key);
                    String temp = strings[match];  // swap strings at match/i
                    strings[match] = strings[i];
                    strings[i] = temp;
                     map.remove(key);  // so this old one won't match anything
                   }
                  else {
                        map.put(key, i);
                       }
                   }
             return strings;
}




	public static void tt(String a[])
	{   String temp;

		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
			if(a[i].compareTo(a[j])>0)
			{  
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;

			}
		}

	}
}