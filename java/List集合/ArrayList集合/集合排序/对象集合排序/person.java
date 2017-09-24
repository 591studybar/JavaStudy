import java.util.*;
public class person 
{
	private String name;
	private int age;
	private String address;
  
    public person(String name,int age,String address)
	{
        this.name=name;
        this.age=age;
        this.address=address;
	}


	public String getName()
	{
       return name;
	}

	public void setName(String name)
	{
        this.name=name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
      this.address=address;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
       this.age=age;
	}

	public static Comparator<person> comp=new Comparator<person>()
	{
		public int compare(person p1,person p2)
		{
           int age1=p1.getAge();
           int age2=p2.getAge();
           return age1-age2;
		}
	};

   public static Comparator<person> compName=new Comparator<person>()
   {
       public int compare(person p1,person p2)
       {
          return p1.getName().compareTo(p2.getName());
       }
   };



    public String toString()
    {
    	return "[name:"+name+",age:"+age+",address:"+address+"]";
    }

}