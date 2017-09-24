import java.util.*;
public class AllSwap
{
	public static void main(String[]args)
	{
        String test[]={"easy", "does", "it", "every", "ice", "eaten"};
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
			     		if(strings[((Integer)map.get(a[0]+""))].compareTo(strings[i])<0)
			     		{
			     			temp=strings[((Integer)map.get(a[0]+""))];
			     			strings[(Integer)map.get(a[0]+"")]=strings[i];
			     		    strings[i]=temp;
			     		    map.remove(a[0]+"");
			     		    map.remove(strings[i]);
			     		}
			     	
			     }
			    
			   }
	    //for(int i=0;i<strings.length;i++)
	    	//map.put(strings[i],strings[i].substring(1,strings[i].length()));
        //for(map.containsKey)
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