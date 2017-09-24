public class test
{
	public static void main(String[]args)
	{
       user u1 =user.creatUser();//u1 reference user t;
       user u2=user.creatUser();//u2 reference user t;
       user u3=user.creatUser();//u3 reference user t;
       user u4=u3;//u4 reference user u3
		//user u1=new user();//creat one user
		//user u2=new user();//creat two user
		//user u3=new user();//creat three user
       u1.setName("hello");
       u1.incrementI();
       System.out.println(u1.getI());
       u1.setAge(10);
       System.out.println(u1.toString());
       System.out.println(u2.toString());
       System.out.println(u3.toString());
       System.out.println(u4.toString());
       u2.setName("test");
       u2.setAge(20);
       u2.incrementI();
       //System.out.println(u1.getI());

       //u2.getI();
       System.out.println(u2.getI());
       
       
       System.out.println(u2.toString());

 
       if(u1==u2)
       	System.out.println("u1 equal u2");
       else
       	System.out.println("u1 not equal u2");

       if (u3==u4) {
       	System.out.println("u4 equal u3");
       }else{
       	System.out.println("u4 not equal u3");
       }
        
       if (u1.getClass()==u3.getClass()) {
       	System.out.println("u1's class equal u3's class");
       }
      

       System.out.println(u1.hashCode());
       System.out.println(u2.hashCode());
	}
}