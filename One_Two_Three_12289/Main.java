package One_Two_Three_12289;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stun
		Scanner abu=new Scanner(System.in);
		int m=Integer.parseInt(abu.nextLine());
		while(true)
		{
			//int m=Integer.parseInt(abu.nextLine());
			
			String input=abu.nextLine();
			//System.out.println(input.length());
			//char[]array=input.toCharArray();
			if(input.length()==5)
			{
				System.out.println("3");
			}
			else if((input.charAt(0)=='o' && input.charAt(1)=='n')||(input.charAt(0)=='o' && input.charAt(1)=='e')||(input.charAt(1)=='n' && input.charAt(2)=='e')||(input.charAt(0)=='o' && input.charAt(2)=='e')||(input.charAt(1)=='o' && input.charAt(2)=='n'))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
			
		}

	}

}
