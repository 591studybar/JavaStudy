public class Glass<T>
{
	private T liquid;
	public  <U extends Juice> String getLiquidTaste(U juice)
	{
	  return juice.taste();
	}
}