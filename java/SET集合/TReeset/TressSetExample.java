import java.util.*;
public class TressSetExample
{
	public static void main(String[]a){
      
      TreeSet<String> tset=new TreeSet<>();
      tset.add("F");
      tset.add("C");
      tset.add("B");
      tset.add("D");
      tset.add("E");
      tset.add("A");
     
     //don't have null value 
      //tset.add(null);
      //tset.add(null);
     // tset.add(null);
      System.out.println(tset);

      HashSet<String> hst=new HashSet<>();
      hst.add("test");
      hst.add("haha");
      hst.add("ab");
      hst.add("nivc");
      hst.add("code");
      hst.add("love");

      TreeSet<String> ts=new TreeSet<>(hst);
      System.out.println(ts);







     
	}
}