	package Big_Number_11734;
	import java.util.*;
	//import java.io.BufferedReader;
	public class Main {
	
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner abu=new Scanner(System.in);
			int counter=Integer.parseInt(abu.nextLine());
			int i=1;
			while(i<=counter)
			{
				String input1=abu.nextLine();
				String input2=abu.nextLine();
				//String k="koko the koko";
				//System.out.println(k.length());
				if(input1.equals(input2))
				{
					System.out.println("Case"+" "+(i++)+":"+" "+"Yes");
				}
				else
				{
					StringBuilder temp1=new StringBuilder();
	                StringBuilder temp2=new StringBuilder();
	                for(int j=0;j<input1.length();j++){
	                    if(input1.charAt(j)!=' ')
	                        temp1.append(input1.charAt(j));
	                    
	                }
	                for(int j=0;j<input2.length();j++){
	                    if(input2.charAt(j)!=' ')
	                        temp2.append(input2.charAt(j));
	                }
				  
					if(temp1.toString().equals(temp2.toString()))
					{
						//System.out.println(temp2.toString());
						System.out.println("Case"+" "+(i++)+":"+" "+"Output Format Error");
					}
					
				
				
					else
				{
			    	System.out.println("Case"+" "+(i++)+":"+" "+"Wrong Answer");
				}
				
				
				
			}
			
	
		}
		}
	}

