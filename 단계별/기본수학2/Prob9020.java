package 단계별.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob9020 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // OPTION 1 : 340ms 43988KB

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            // 에라토스테네스의 체

            int num = Integer.parseInt(br.readLine());

            boolean[] check = new boolean[num+1];

            check[0] = true;
            check[1] = true;

            for (int j = 2; j <= Math.sqrt(num+1); j++) {

                if (check[j]) continue;

                for (int k = j*j; k <= num; k += j) {
                    check[k] = true;
                }
            }

            // 두 소수 구하기

            int num1 = num / 2;
            int num2 = num / 2;

            while (true) {

                if (!check[num1] && !check[num2]) {
                    sb.append(num1 + " " + num2  + "\n");
                    break;
                }

                num1--; num2++;
            }
        }
        
        System.out.println(sb);
        br.close(); 
    }
}
