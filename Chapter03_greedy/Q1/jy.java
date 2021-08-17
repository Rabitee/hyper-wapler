package Chapter03_greedy.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * jy
 */
public class jy {

    static int[] coins = { 500, 100, 50, 10 };

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int coin : coins) {
            sum += N / coin;
            N %= coin;
        }

        System.out.println(sum);
    }
}