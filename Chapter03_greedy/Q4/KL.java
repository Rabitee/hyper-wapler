import java.util.Scanner;

public class KL {
    public static void main(String[] args) {
        int N,K;
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        K = scanner.nextInt();

        scanner.close();

        int result = 0;
        while(true) {
            if(N == 1) {
                break;
            } else if(N < K) {
                result += N-1;
                break;
            }

            N /= K;
            result++;
        }

        System.out.println("result: " + result);
    }
}
