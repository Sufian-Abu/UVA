import java.util.*;
//import java.io.*;
import java.io.IOException;
public class Main
{
  public static void main(String []args) throws IOException
  {
    Scanner abu=new Scanner(System.in);
    int count=1;
    try
    {
      while(true)
      {
        long B=abu.nextLong();
        long S=abu.nextLong();
        if(B==0 && S==0)
        {
          break;
        }
        else
        {
        if(B==1)
        {
          System.out.println("Case"+" "+(count++)+":"+" "+":"+"-"+"\\");
          
        }
        else if(B==S)
        {
          System.out.println("Case"+" "+(count++)+":"+" "+":-|");
        }
        else if(S>B)
        {
          System.out.println("Case"+" "+(count++)+":"+" "+":-|");
        }
        else if((S*(B-1))>(B*(S-1)))
        {
          System.out.println("Case"+" "+(count++)+":"+" "+":-(");
        }
        else
        {
          System.out.println("Case"+" "+(count++)+":"+" "+":-)");
        }
        }
        
      }
    }
    
    catch(Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      if(abu !=null)
      {
        abu.close();
      }
    }
  }
}