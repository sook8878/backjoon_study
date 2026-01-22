package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            if (n == -1) {
                return;
            }

            int index = 0;
            int[] factors = new int[n];
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    factors[index] = i;
                    index++;
                }
            }

            String result = n + " = ";
            int sum = 0;
            for (int i = 0; i < factors[i]; i++) {

                int factor = factors[i];
                if (factor == 0) {
                    break;
                }
                sum += factor;
                if (i == 0) {
                    result += "" + factor;
                } else
                    result += " + " + factor;
            }

            if (sum == n) {
                System.out.println(result);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}