import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] cards = new int[n];

        for(int i = 0; i < n; i++) {
            cards[i] = scan.nextInt();
        }
        
        int max = 0;
        
        for(int i = 0; i< n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(max < cards[i]+cards[j]+cards[k] && cards[i]+cards[j]+cards[k]<=m)
                        max = cards[i]+cards[j]+cards[k];
                }
            }
        }
        
        System.out.println(max);
    }
}
