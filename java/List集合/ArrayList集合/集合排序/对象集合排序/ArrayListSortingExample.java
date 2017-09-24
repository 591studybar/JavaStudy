import java.util.*;

public class ArrayListSortingExample
{
	public static void main(String[]args)
	{
        //copareble implements object sorting
        ArrayList<Student> arrlist=new ArrayList<>();
        arrlist.add(new Student("hell0",223,10));
        arrlist.add(new Student("test",233,10));
        arrlist.add(new Student("aorld",245,26));

        Collections.sort(arrlist);

        for(Student s:arrlist)
          System.out.println(s);

        //comparator  implements sorting,comparator interface don't need compare class implement
        System.out.println("age sorting:");
        ArrayList<person> personarrlist3=new ArrayList<>();
        personarrlist3.add(new person("hell",10,"belin road"));
        personarrlist3.add(new person("test",20,"bh road"));
        personarrlist3.add(new person("world",12,"hs road"));
        Collections.sort(personarrlist3,person.comp);

         for(person s:personarrlist3)
          System.out.println(s);

         //comparator  implements sorting,comparator interface don't need compare class implement
        System.out.println("name sorting:");
        ArrayList<person> personarrlist4=new ArrayList<>();
        personarrlist4.add(new person("hell",10,"belin road"));
        personarrlist4.add(new person("test",20,"bh road"));
        personarrlist4.add(new person("world",12,"hs road"));
        Collections.sort(personarrlist4,person.compName);

         for(person s:personarrlist4)
          System.out.println(s);



        //anoymous class test
        System.out.println("age sorting:");
        ArrayList<Student> personarrlist1=new ArrayList<>();
        personarrlist1.add(new Student("hell",101,12));
        personarrlist1.add(new Student("test",201,13));
        personarrlist1.add(new Student("world",121,10));

        Collections.sort(personarrlist1,new Comparator()
        	{
        		public int compare(Object p1,Object p2)
        		{
                  return ((Student)p1).getAge()-((Student)p2).getAge();
        		}
        	});



        for(Student s:personarrlist1)
          System.out.println(s);

       // lambda expression
        Collections.sort(personarrlist1,(p1,p2)->{return ((Student)p1).getName().compareTo(((Student)p2).getName());});

        
         for(Student s:personarrlist1)
         System.out.println(s);

        ArrayList<person> personarrlist2=new ArrayList<>();
        personarrlist2.add(new person("hell",10,"belin road"));
        personarrlist2.add(new person("test",20,"bh road"));
        personarrlist2.add(new person("world",12,"hs road"));


	}
}