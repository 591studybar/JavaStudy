public class test
{
	public static void main(String[]args)
	{
         father a=new child();
         father b=new baby();
         print("this is chilid one",a);
         print("this is baby one",b);
         print("this is child two!!",
         	new baby()
         	{
         		public void print(String s)
         		{
         			System.out.println(s);
         		}

         	}
         	);

         father n=new father(){ public void print(String s){} };

         print("this is test",n);

         
         print("this is lambada test",(s)->{System.out.println(s);});

         print("this is lambada test",System.out::println);
         	
         
	}


	public static void print(String s,father a)
	{
        a.print(s);
       
	}
}