import java.util.Arrays;
import java.util.Scanner;

public class KL {
    public static void main(String[] args) {
        int N, M, K;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        K = scanner.nextInt();

        int arr[] = new int [N];
        for(int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        Arrays.sort(arr);

        int max = arr[N-1];
        int secondMax= arr[N-2];

        int duplCnt = 0;
        int result = 0;
        for(int i=0; i<M; i++) {
            if(duplCnt == K) {
                duplCnt = 0;
                result += secondMax;
            } else {
                duplCnt++;
                result += max;
            }
        }

        System.out.println("result: " + result);
    }    
}
