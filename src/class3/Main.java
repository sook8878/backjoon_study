package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 1은 소수 아님
        String nStrTemp = "";
        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {
                n = (n / i);
                nStrTemp += " " + i;

                i = 1;
            }
        }

        String[] nStrArray = nStrTemp.trim().split(" ");
        for(String nStr : nStrArray){
            System.out.println(nStr);
        }
    }
}