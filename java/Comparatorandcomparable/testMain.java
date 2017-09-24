import java.util.*;
public class testMain
{
	public static void main(String[]args)
	{
      person p=new person(1,"test",20,"linxin road");
      System.out.println(p);
      person []t={new person(1,"test",10,"linxin road"),new person(10,"111",50,"linxin road"),new person(5,"test",20,"linxin road")};

      for(int i=0;i<t.length;i++)
      	System.out.println(t[i]);
         sort(t);
      for(int i=0;i<t.length;i++) 
      	System.out.println(t[i]);

      ArrayList<person> l=new ArrayList<>();
      l.add(new person(1,"test",10,"linxin road"));
      l.add(new person(60,"test",70,"linxin road"));
      l.add(new person(50,"test",50,"linxin road"));
      //Collections.sort(l);
      for(person o:l)
      	System.out.println(o);
	}    


	public static void sort(person []a)
	{
		person temp=null;
       for(int i=0;i<a.length-1;i++)
       {
            if(a[i].comparaTo(a[i+1])<0)
            {
            	temp=a[i];
            	a[i]=a[i+1];
            	a[i+1]=temp;
            }
       }
	}
}