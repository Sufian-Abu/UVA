import java.util.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner abu = new Scanner (System.in);
    int k=1;
    while(true)
    {
      int number=abu.nextInt();
      int [] array=new int[number];
      int giveto=0,given=0;
      
      if(number==0)
      {
        break;
      }
      
      else
      {
        for(int i=0;i<array.length;i++)
        {
          array[i]=abu.nextInt();
        }
      }
      
      for(int i=0;i<array.length;i++)
      {
        if(array[i]==0)
        {
          given++;
        }
        else
        {
          giveto++;
        }
      }
      
      System.out.println("Case"+" "+(k++)+":"+" "+(giveto-given));
      
    }
    
  }
  
}