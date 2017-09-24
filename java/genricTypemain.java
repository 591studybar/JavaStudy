import java.time.*;

public class genricTypemain{
	
	public static void main(String[]args){
       LocalDate[] birthdays=
       {
         LocalDate.of(1906,12,9),
         LocalDate.of(1815,12,10),
         LocalDate.of(1903,12,3),
         Localdate.of(1910,6,22)

       };

       genricType<LocalDate> mm= minmax(birthdays);
       System.out.println("min="+mm.getX());
       System.out.println("max="+mm.getY());
    }

	    public static <T extends Comparable> T minmax(T []a){
          if(a==null&&a.length==0) return null;
          T min=a[0];
          T max=a[0];
          for(int i=0;i<a.length;i++){
          if(min>a[i]) a[i]=min;
          if(max<a[i]) a[i]=max;
          }
          return new genricType<T>(min,max);
       }
}