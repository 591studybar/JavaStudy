import java.util.*;
public class VectorCopy
{
	public static void main(String[]ar)
	{
      Vector<String> va=new Vector<>();
      va.add("A");
      va.add("B");
      va.add("C");
      va.add("D");
      va.add("E");

      Vector<String> vb=new Vector<String>();
      vb.add("1");
      vb.add("2");
      vb.add("3");
      vb.add("4");
      vb.add("5");
      vb.add("6");
      vb.add("7");

      System.out.println("Vector vb before copy:"+vb);
      Collections.copy(vb,va);
      System.out.println("Vector vb after copy:"+vb);

	}
}