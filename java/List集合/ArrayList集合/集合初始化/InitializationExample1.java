import java.util.*;
public class InitializationExample1
{
    public static void main(String[]args)
    {
       //the first one  aslist
       ArrayList<String> obj=new ArrayList<>(Arrays.asList("1111","2222","3333","4444","5555","6666","7777"));
       System.out.println("Elements1 are:"+obj);

       // anymous inner class 
       ArrayList<String> obj1=new ArrayList<String>(){{add("111");add("2222");add("3333");}};
       System.out.println("Elements2 are:"+obj1);

       ArrayList<String> obj2=new ArrayList<String>(){{add("1111");}};

       //three generite
       ArrayList<String> obj3=new ArrayList<String>();
       obj3.add("1111");
       obj3.add("2222");
       obj3.add("3333");
       obj3.add("4444");
       System.out.println("Elements3 are:"+obj3);


       //four use collections.ncopies

       ArrayList<Integer> obj4=new ArrayList<>(Collections.nCopies(10,6));
       System.out.println("Elements4 are:"+obj4);
       
    }
	
}