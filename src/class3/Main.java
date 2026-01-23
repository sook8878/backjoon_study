package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(st.nextToken());
            // 1은 소수 아님
            if(n == 1){
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j < n; j++) {
                if(n % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                count++;
            }
        }

        System.out.println(count);
    }
}