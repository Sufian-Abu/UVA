import java.util.*;
public class Main
{

 /**
  * @param args
  */
 public static void main(String[] args) throws Exception {
  // TODO Auto-generated method stun
  Scanner abu=new Scanner(System.in);
  int m=abu.nextInt();
  int c=1;
  while(c<=m)
  {
   long first=abu.nextLong();
   long second=abu.nextLong();
   Long third=abu.nextLong();
   
   if(first+second<=third || second+third<=first || first+third<=second || first<=0 ||second<=0)
   {
     System.out.println("Case"+" "+(c++)+":"+" "+"Invalid");
   }
   else
     {
   if(first==second && first==third && second==third)
   {
     System.out.println("Case"+" "+(c++)+":"+" "+"Equilateral");
   }
   else if(first==second || second==third || first==third)
   {
      System.out.println("Case"+" "+(c++)+":"+" "+"Isosceles");
   }
   else if (first!=second && second !=third && first !=third)
   {
      System.out.println("Case"+" "+(c++)+":"+" "+"Scalene");
   }
   }
   
   
   
  }

 }

}
