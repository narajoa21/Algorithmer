import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
        k = sc.nextInt();
        int[] coins = new int[n];
		for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        int answer = 0;
        for(int i = n-1; i >=0 ; i--){
            
            while(coins[i] <= k){
                k = k - coins[i];
                answer++;
            }
            if( k == 0)
                break;
        }
        System.out.println(answer);
	}
}
