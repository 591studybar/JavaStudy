public class user
{
     private static final user t=new user();
     private static  int i=0;

     private String name;
     private int age;

     public static user creatUser()
     {
          return t;
     }
     
     public void setAge(int age)
     {
        this.age=age;
     }

     public void setName(String name)
     {
       this.name=name;     
     }

     public int getAge()
     {
       return age;     
     }

     public String getName()
     {
        return name;
     }

     public String toString()
     {
        return  "name is:"+name+"\n"+"the age is:"+age;
     }
 
     public void incrementI()
     {
        i++;
     }
	 
	 public int getI()
	 {
	 	return i;
	 }
}