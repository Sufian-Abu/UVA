import java.io.*;
import java.util.*;
class Main
{
  public static void main(String[]args) throws IOException
  {
    BufferedReader abu=new BufferedReader (new InputStreamReader(System.in));
    int m=Integer.parseInt(abu.readLine());
    while(m>0)
    {
      StringTokenizer stk = new StringTokenizer(abu.readLine());
      int e=Integer.parseInt(stk.nextToken());
      int f=Integer.parseInt(stk.nextToken());
      int c=Integer.parseInt(stk.nextToken());
      int sum=e+f;
      int result=0;
      
      while(sum>=c)
      {
        result=result+sum/c;
        sum=sum/c+sum%c;
      }
      System.out.println(result);
      m--;
    }
    abu.close();
    System.exit(0);
  }
}
    
    
    
 