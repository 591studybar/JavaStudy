public class Student implements Comparable
{
	private String name;
	private int studentno;
	private int age;

	public Student(String name,int studentno,int age)
	{
        this.name=name;
        this.studentno=studentno;
        this.age=age;
	}


	public String getName()
	{
       return name;
	}

	public void setName(String name)
	{
        this.name=name;
	}

	public int getNo()
	{
		return studentno;
	}

	public void setNo(int studentno)
	{
      this.studentno=studentno;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
       this.age=age;
	}


	public int compareTo(Object othertest)
	{    
	    
        //compare the age
        //return  this.getAge()-((Student)othertest).getAge();
        
        /*compare the age
        Student other=(Student)othertest;
        if(this.getAge()>other.getAge())
        	return 1;
        else if (this.getAge()==other.getAge()) 
        	return 0;
        else
        	return -1;
        	*/

        //compare the name
        Student other=(Student)othertest;
        return this.getName().compareTo(other.getName());


        
	}


	public String toString()
	{
		return "[age:"+age+"],[name:"+name+"][no:"+studentno+"]";
	}


}