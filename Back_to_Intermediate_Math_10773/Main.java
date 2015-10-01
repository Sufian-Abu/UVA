	package Back_to_Intermediate_Math_10773;
	import java.util.*;
	import java.lang.Math;
	import java.text.DecimalFormat;
	public class Main {
	
		/**
		 * @param args
		 */
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
	       Scanner abu=new Scanner(System.in);
	       int counter=abu.nextInt();
	       int i=1;
	       while(i<=counter)
	       {
	    	   int d=abu.nextInt();
	    	   int v=abu.nextInt();
	    	   int u=abu.nextInt();
	    	   double t2=Math.pow(v,2);
    		   double t1= Math.pow(u,2);
    		   double result1=(double)(t1-t2);
	    	   if(result1<.001 || u<.001 || v <.001)
	    	   {
	    		   System.out.println("Case"+" "+(i++)+":"+" "+"can't determine");
	    	   }
	    	   else
	    	   {
	    		 
	    	        double result=d/Math.sqrt(result1);
	    	        double koko=(double)d/u;
	                double ans=(result-koko);
	    		   DecimalFormat f = new DecimalFormat("##0.000");
	    		   System.out.println("Case"+" "+(i++)+":"+" "+(f.format(ans)));
	    	   }
	       }
		}
	
	}
