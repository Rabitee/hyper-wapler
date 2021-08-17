package Chapter03_greedy.Q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class jy {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] minCard = new int[N];
        int[] innerCard = new int[M];
        int min = 0;
        int tmp;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            /* ---------- dirty code ---------- */
            tmp = M;
            if (tmp == 1) {
                minCard[i] = Integer.parseInt(st.nextToken());
                continue;
            }
            else {
                min = Math.min(
                    Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken())
                );
                tmp--;
    
                while (tmp != 1) {
                    min = Math.min(min ,Integer.parseInt(st.nextToken()));
                    tmp--;
                }
                minCard[i] = min;
            }



            /* ---------- clean code ---------- */
            for (int j = 0; j < M; j++) {
                innerCard[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(innerCard);
            minCard[i] = innerCard[0];
        }

        Arrays.sort(minCard);
        System.out.println(minCard[N - 1]); // 가장 큰 수
    }
}
