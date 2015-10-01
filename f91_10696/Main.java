package f91_10696;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws 
    NumberFormatException, 
    IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new 
                InputStreamReader(System.in));
     String s = "";
     while (!(s= in.readLine()).equals("0"))
		
		
		{
		
    	 int m = Integer.parseInt(s);
			
			
			
			System.out.println("f91"+"("+(m)+")"+" "+"="+ " "+Main.koko(m));
			
		}

	}
	public  static int koko(int n)
	{
		
		if(n>=100)
		{
			return n-10;
		}
		else
		{
			return koko(koko(n+11));
		}
		
	}

}
