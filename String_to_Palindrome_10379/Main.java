	package String_to_Palindrome_10379;
	import java.util.*;
	public class Main {
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner abu=new Scanner(System.in);
			int m=Integer.parseInt(abu.nextLine());
			int count=1;
			while(count<=m)
			{
				String input=abu.nextLine();
				int counter1=0;
				int counter2=input.length()-1;
				int result=0;
				for(int c=0;c<input.length()/2;c++)
				{
					//System.out.println(input.charAt(13));
					if(input.charAt(counter1)!=input.charAt(counter2))
					{
					//System.out.println(input.charAt(13));
					result++;
						//counter1++;
						//counter2--;
					}
					counter1++;
					counter2--;
				}
				
				System.out.println("Case"+" "+(count++)+":"+" "+result);
				}
			
				
		}
	
	}
	

