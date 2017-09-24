import java.util.*;
public class ArrayListCompare
{
	public  static void main(String[]args)
	{
	    ArrayList<String> al1=new ArrayList<>();
	    al1.add("hi");
	    al1.add("how are you");
	    al1.add("Good Morning");
	    al1.add("bye");
	    al1.add("Good night");
	    al1.add("haha");

	    ArrayList<String> al2=new ArrayList<>();
	    al2.add("Howdy");
	    al2.add("Good Evening");
	    al2.add("bye");
	    al2.add("Good night");
	    al2.add("haha");
	    al2.add("hello");

         ArrayList<String> al3=new ArrayList<>();
        
         //first 
        /* for(String temp:al1)
         al3.add(al2.contains(temp)?"Yes":"No");
         System.out.println(al3);
         */

         //second
         int tag=0;
         for(int i=0;i<al1.size();i++)
         	{   
         		for (int j=0;j<al2.size();j++)
         	      
         	      	{
         	      		if(al1.get(i).equals(al2.get(j)))
         	      		
         	      		    { al3.add(al1.get(i));
                             tag=1;
                            }
         	      		 
                     }
                if(tag==0){
                al3.add("Null");
                 }
               }
        System.out.println(al3);

        //

         	

	}
}