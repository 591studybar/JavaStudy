import java.util.*;

public class VectorSort
{
	public static void main(String[]args)
	{
      Vector<String> v=new Vector<>();

      v.add("C");
      v.add("D");
      v.add("A");
      v.add("B");
      v.add("F");
      System.out.println("Vector elements before sorting is:");
      for(int i=0;i<v.size();i++)
      	System.out.println(v.get(i));

      Collections.sort(v);
      System.out.println("Vector elements after sorting is:");
      for (int i=0;i<v.size();i++ ) {
      	System.out.println(v.get(i));
      }


      Vector<person> vs=new Vector<>();
      vs.add(new person("hello",40));
      vs.add(new person("what",20));
      vs.add(new person("double",30));
      System.out.println(vs);
      Collections.sort(vs);
      System.out.println(vs);

      Collections.sort(vs,new Comparator(){
      	public int compare(Object a,Object b)
      	{
      		return ((person)a).getName().compareTo(((person)b).getName());
      	}
      });
      
      System.out.println(vs);

      Collections.sort(vs,(Object a,Object b)->{return ((person)a).getName().compareTo(((person)b).getName());});
	}
}