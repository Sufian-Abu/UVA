
import java.util.*;
//import java.io.*;
import java.io.IOException;
//import java.math.BigInteger;
public class Main
{
public static void main(String []args) throws IOException
{
  Scanner abu=new Scanner(System.in);
  int [] array=new int[1000];
  
  
 
  try
  {
	  int count=0;
	 while(true)
	  {
		 int n=abu.nextInt();
		 
    for(int i=0;i<n;i++)
    {
    	array[i]=abu.nextInt();
    }
    for(int i=0;i<n;i++)
    {
    	for(int j=i+1;j<n;j++)
    	{
    		if(array[i]>array[j])
    		{
    			count++;
    		}
    	}
    }
    
    System.out.println("Minimum"+" "+"exchange"+" "+"operations"+" "+":"+" "+count);
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