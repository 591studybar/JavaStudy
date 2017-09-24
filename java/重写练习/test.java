public class test{
	public static void main(String[]args)
	{
       Child_Params c =new Child_Params();
       Parent_params b =new Child_Params();
       c.method("test","hh",1,1.0f);
       c.method("1","2",2);
       c.method("11","22");
       c.method("ss");
      
       ((Child_Params)b).method("ss");
       b.method("ss","ss",1,1.22f);
        
        Parent_params v= new Child_Params();
        Parent_params f =new Child_Params();
        Child_Params d=new Child_Params();
        ((Child_Params)v).method2("test",20,"test");
        //f.method2("test","test",20);
        d.method2("test","test",20);
        f.method2("test",12,"test");





	}

}