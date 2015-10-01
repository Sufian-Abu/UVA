package acm__10298_power_strings;
//import java.nio.charset.Charset;
import java.io.IOException;
import java.util.*;
public class main {

	/**
	 * @param args
	 */
	public main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
     Scanner abu=new Scanner(System.in);
 	
     String input=abu.nextLine();
     char[]x=new char [input.length()];
    
     
    	 int k=0;
    	 int counter=0;
    	 char c=input.charAt(k);
    	 System.out.println(c);
         x=input.toCharArray();
         for(int i=0;i<x.length;i++)
         {
        	 if(x[i]==c)
        	 {
        		 counter++;
        	 }
         }
         
         System.out.println(counter);
         
     
	}

}
