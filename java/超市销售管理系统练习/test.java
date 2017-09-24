import java.lang.*;
import java.io.*;
import java.util.*;
public class test
{
	static ArrayList<Product> product =new ArrayList<Product>();
	public static void main(String []ar)
	{

       
	   System.out.println("********************************");
	   System.out.println("**Welcom To SuperMarket System**");
	   System.out.println("please input follow the numbers:");
	   System.out.println("0,query product 1,add product 2,delete product 3,update product name 4,update product stock 5,update product stock ");
	   System.out.println("6,buy product 7,exit");
	   int x=0;
	   while(x!=1)
	   {
         Scanner in=new Scanner(System.in);
         int result= in.nextInt();
         switch(result)
         {
         	case 0:qureyProduct();break;
         	case 1:addProduct();break;
         	case 2:deleteProductById();break;
         	case 3:updateProductNameById();break;
         	case 4:
         	case 5:
         	case 6:buyproduct();break;
         	case 7:x=1;break;
            default:break;
         }
	   }
	   
	   
       
	}

	public static void addProduct()
	   {    
            System.out.println("please input the product id:");
            Scanner in=new Scanner(System.in);
            Product p= new Product();
            p.setId(in.nextInt());
            System.out.println("please input the product name:");
             p.setName(in.next());
            System.out.println("please input the product price:");
            p.setPrice(in.nextDouble());
            System.out.println("please input the product stock:");
            p.setStock(in.nextInt());
            if(in.nextInt()==1)
            {
              product.add(p);
            }else
            {
            	System.out.println("cancel");
            	product.add(null);
            }

           //return product;

	   }


	   public static void qureyProduct()
	   {
	   	 System.out.println("please input the product id:");
	   	 Scanner in =new Scanner(System.in);
	   	 int id=in.nextInt();
         Product s=new Product();
         Iterator it=product.iterator();
	   	 while(it.hasNext())
	   	  	{
	   	  		s=(Product)it.next();
                if(s.getId()==id)
                {
                	System.out.println("the product name is:"+s.getName()+"\nthe price is"+s.getPrice()+"\nthe stock is:"+s.getStock());
                }else
                {
                	System.out.println("have't Product ");
                }

	   	  	}

	   }


	  public static void deleteProductById()
	  {
	  	System.out.println("please input product id:");
	  	Scanner in=new Scanner(System.in);
	  	int id=in.nextInt();
	  	Product s=new Product();
         Iterator it=product.iterator();
         int tag=0;
	   	 while(it.hasNext())
	   	  	{
	   	  		s=(Product)it.next();
                if(s.getId()==id)
                {  
                	product.remove(id-1);
                	System.out.println("the product have delete");
                	tag=1;
                }

	   	  	}
	   	  if (tag==0) {
	   	  	System.out.println("have't the Product");
	   	  }
	  }

	  public static void updateProductNameById()
	  {
	  	System.out.println("please input product id:");
	  	Scanner in=new Scanner(System.in);
	  	int id=in.nextInt();
        Product s=new Product();
        Iterator it=product.iterator();
        int tag=0;
	   	while(it.hasNext())
	   	  	{
	   	  		s=(Product)it.next();
                if(s.getId()==id)
                {   String name=in.next();
                	s.setName(name);
                	
                	System.out.println("the product have update");
                	tag=1;
                }

	   	  	}
	   	  if (tag==0) {
	   	  	System.out.println("have't the Product");
	   	  }
         }


	   	  public static void buyproduct()
	   	  {
             System.out.println("input the product id:");
             int i=0;
             ArrayList<Product> d=new ArrayList<Product>();
             Product s=new Product();
             Iterator it=product.iterator();
             while(i!=-1)
             {
               Scanner in=new Scanner(System.in);
               int id =in.nextInt();
               
               if(id!=-1)
              { while(it.hasNext())
	   	  	  {
	   	  		s=(Product)it.next();
                if(s.getId()==id)
                {   
                 d.add(s);
                }
                
               }
              }
             else
               {
               	i=-1;
               }
               System.out.println(d);
	   	  }
	  
	  }
     



}