import java.util.Scanner;

public class KL {

    public static void main(String[] args) {
        int M, N;
        Scanner scanner = new Scanner(System.in);
    
        M = scanner.nextInt();
        N = scanner.nextInt();
        
        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int result = 0;
        for(int i=0; i<N; i++) {
            int tempMin = 10001;
            for(int j=0; j<M; j++) {
                tempMin = Math.min(tempMin, arr[i][j]);
            }
            result = Math.max(result, tempMin);    
        }

        System.out.println("result: " + result);
    }
}
