package 단계별.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2839 {
    public static void main(String[] args) throws IOException {
       
        // OPTION 1 : 124ms 14224KB
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int weight = Integer.parseInt(br.readLine());

        int count5 = weight / 5;

        while ((weight - count5*5) % 3 != 0) {
            if (count5 == 0) break;
            count5--;
        }

        if ((weight - count5*5) % 3 == 0) {
            sb.append(count5 + ((weight - 5*count5) / 3));
        } else {
            sb.append("-1");
        }

        System.out.println(sb);
        br.close(); 
    }
}
