package Jolly_Jumpers_10038;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abu=new Scanner(System.in);
		int counter=abu.nextInt();
		int[]x=new int[counter];
		int[]y=new int[counter-1];
		int pointer1=0,pointer2=0;
		int i=0;
		//while(true)
		//{
		while(i<counter)
		{
			x[i]=abu.nextInt();
			i++;
		}
		for(int j=0;i<x.length;i++)
		{
			y[j]=Math.abs((y[j]-y[j+1]));
		}
		for(int k=0;k<y.length;k++)
		{
			if(y[k]>=y[k+1])
			{
				pointer1++;
			}
			else
			{
				pointer2++;
			}
		}
		if(pointer1>pointer2)
		{
			System.out.println("Jolly");
		}
		else
		{
			System.out.println("Not jolly");
		}
		
	

	}

}
//}