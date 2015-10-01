package Hello_World_11636;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       Scanner abu=new Scanner(System.in);
       
       int pointer=0;
       while(true)
       {
    	   int input=abu.nextInt();
    	   
    	   int linetobeprinted=1;
    	   int  linecopied=0;
    	   if(input<0)
    	   {
    		   break;
    	   }
    	   
    	   else
    	   {
    		   pointer=pointer+1;
    		   
    		   while(linetobeprinted<input)
    		   {
    			   linetobeprinted=linetobeprinted+linetobeprinted;
    			   linecopied=linecopied+1;
    		   }
    	   }
    	   System.out.println("Case"+" "+pointer+":"+" "+linecopied);
       }

	}

}
