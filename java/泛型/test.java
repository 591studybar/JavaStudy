import java.util.*;

public class test
{
	public static void main(String[]args)
	{
        tt<String> x=new tt<String>();
        x.setX("ss");
        x.setY("xx");
        print(x);

        tt<Integer> y=new tt<Integer>();
        y.setX(10);
        y.setY(20);
        print(y);

        father f=new father();
        f.setName("hello");
        f.setAge(10);
        father n=new father();
        n.setName("llop");
        n.setAge(20);
        tt<father> z=new tt<father>();
        z.setX(f);
        z.setY(n);
        printf(z);
        child l= new child();
        l.setName("haha");
        l.setAge(15);
        child m=new child();
        m.setName("aa");
        m.setAge(20);
        tt<child> p=new tt<child>();
        p.setX(l);
        p.setY(m);
        //printf(p);
        
        printz(p);
        printz(z);

        //Queue<father> fat=new ArrayDeque(100);
       // fat.add(new father());
        Queue<father> fat =new LinkedList();
        fat.add(l);
        fat.add(m);

	}

	public static void print(tt<?> xx)
	{
         xx.print();
	}

	public static void printf(tt<? super child> xx)
	{
         xx.print();
	}

	public static void printz(tt<? extends father> xx)
	{
         xx.print();
	}
}