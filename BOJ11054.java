import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[][] dp = new int[n][3];
        
        int max = 1;
        
        for(int i = 0; i < n; i++){
            int v = scan.nextInt();
            dp[i][0] = v;
            dp[i][1] = 1;
            dp[i][2] = 1;
            for(int j = 0; j < i; j++){
                if(dp[j][0] < v)
                    dp[i][1] = Math.max(dp[i][1], dp[j][1] + 1);
                if(dp[j][0] > v){
                    dp[i][2] = Math.max(dp[i][2], dp[j][2] + 1);
                    dp[i][2] = Math.max(dp[i][2], dp[j][1] + 1);
                }
            }
            max = Math.max(max, Math.max(dp[i][1],dp[i][2]));
        }
        System.out.println(max);
    }
}
