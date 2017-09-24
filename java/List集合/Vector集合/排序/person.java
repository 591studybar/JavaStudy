public class person  implements Comparable
{
	private String name;
	private int age;

	public person(String name,int age)
	{
      this.name=name;
      this.age=age;
	}

	public String getName()
	{
	  return name;
	}
	public int getAge()
	{
	  return age;
	}

	public void setName(String name)
	{
	  this.name=name;
	}

	public void setAge(int age)
	{
      this.age=age;
	}
     
    public int compareTo(Object a)
    {
       return this.age-((person)a).age;
    }

	public String toString()
	{
		return "[name is "+name+",age is "+age+"]";
	}
}