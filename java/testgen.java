public class testgen
{
	public static void main(String[]a)
	{
       Glass<Water> water=new Glass<>();
       Glass<Juice>  juice=new Glass<>();
       orangeJuice oj=new orangeJuice();
       
       System.out.println(water.getLiquidTaste(oj));

	}

	public static <T> T add(T a,T b)
	{
       T result =null;
       return result;
	}
}