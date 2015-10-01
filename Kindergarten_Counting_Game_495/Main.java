package Kindergarten_Counting_Game_495;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Scanner abu=new Scanner(System.in);
		//String line;
		while(abu.hasNext())
		{
			boolean answer=false;
		    String line=abu.nextLine();
		    int result=0;
			char [] array=line.toCharArray();
			
			for(char koko: array)
			{
				if(Character.isLetter(koko))
				{
					if(!answer)
					{
						result++;
					  answer=true;
					
					}
				}
				else
				{
					answer=false;
				}
			}
			System.out.println(result);
			
		}
	
	
}
}
