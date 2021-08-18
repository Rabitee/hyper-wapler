import java.util.Scanner;

public class KL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();

        scanner.close();

        int[] arr = {500, 100, 50, 10};
        int result = 0;
        for(int num : arr) {
            result += change / num;
            change %= num;
        }

        System.out.println("거스름돈 갯수:" + result);
    }
}