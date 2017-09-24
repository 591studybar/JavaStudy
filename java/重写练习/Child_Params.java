class Child_Params extends Parent_params{
	
	void method(String a,String b,int c,float d)
	{
          System.out.println("a is b");
	}

	void method(String b,String a,float d,int c)
	{
          System.out.println("a is b");
	}

	void method(String a,String b,int v){
      System.out.println("same method overid");
	}

	void method(String a,String b)
	{
      System.out.println("a,b method");
	}

	void method(String a)
	{
       System.out.println("a method");
	}

	void method2(String a,String v,int b)
	{
		System.out.println("a sss"+"b xx"+"c vvv");

	}
}