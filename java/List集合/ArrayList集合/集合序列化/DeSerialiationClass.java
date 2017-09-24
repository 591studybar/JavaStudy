import java.io.*;
import java.util.*;

public class DeSerialiationClass
{
	public static void main(String[]a)
	{
        ArrayList<String> arraylist=new ArrayList<String>();
        try
        {
            FileInputStream fis=new FileInputStream("myfile");
            ObjectInputStream ois=new ObjectInputStream(fis);
            arraylist =(ArrayList)ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe)
        {
         ioe.printStackTrace();
         return;
        }catch(ClassNotFoundException c)
        {
          System.out.println("class not found");
          c.printStackTrace();
          return;
        }
        for(String tmp:arraylist)
        {
           System.out.println(tmp);
        }
	}
}