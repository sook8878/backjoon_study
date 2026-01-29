package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double pow = Math.pow(n,2);
        System.out.println((long) pow);
        System.out.println(2);
    }
}