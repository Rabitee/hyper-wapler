package Chapter03_greedy.Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class jy {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 배열의 길이
        int M = Integer.parseInt(st.nextToken()); // 더할 횟수
        int K = Integer.parseInt(st.nextToken()); // 중복가능한 수
        int[] numArray = new int[N];
        int sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArray);

        int big = numArray[N - 1];
        int small = numArray[N - 2];
        int tmp = K;
        
        for (int i = 0; i < M; i++) {
            if (tmp != 0) {
                sum += big;
                tmp--;
            }
            else {
                sum += small;
                tmp = K;
            }
        }
        System.out.println(sum);
    }
}