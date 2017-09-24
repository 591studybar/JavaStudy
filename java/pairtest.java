public class pairtest{
	
	public  static void main(String[]args){
   
         pair<genricType> p=new pair<genricType>();
         pair<String>  d=new pair<String>();
         //pair<String>[]  e=new pair<String>[10];
         //pair<String>[]  f=null;
         //{new pair<String>(),new pair<String>()};
         //f[0]=new pair<String>();
         pair<String>[] table=(pair<String>[])new pair<?>[10];
         Object[] a=new Object[10];
         a[0]="hello";
         //a[1]=d;
         if(p.getClass()==d.getClass())
          System.out.println("this is true"+p.getClass()+d.getClass());
         
         if(p instanceof pair)
         	System.out.println("p is pair class");
         else 
          System.out.println("p isn't pair");

         if (d instanceof pair) {
         	System.out.println("d is pair class");
         }else{
         	System.out.println("d isn't class");
         }
         

	}


}