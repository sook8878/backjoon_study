package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int minPrime = 0;
        boolean check = false;
        for (int i = m; i <= n; i++) {
            // 1은 소수 아님
            if(i == 1){
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                sum += i;
                if(!check){
                    minPrime = i;
                    check = true;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
}