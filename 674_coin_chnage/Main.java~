import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
// goo.gl/jgDgRi
    public static void main(String[] args) {
        int[] coins = { 1, 5, 10, 25, 50 };
        int len = 5;
        int MAX = 7490;
        long[] ways;
        ways = new long[MAX];
        Arrays.fill(ways, 0);
        ways[0] = 1;
        //System.out.println(ways[33]);
        int coin = 0;
        for (int i = 0; i < len; i++)
        {
            for (int j = coins[i]; j < MAX; j++)
            {
                ways[j] += ways[j - coins[i]];
                
             }
        }
 
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.println(ways[in.nextInt()]);
            break;
             
        }
    }
}