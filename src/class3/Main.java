package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // f(n) 은 a1n + a0
        // (a1n + a0) <= c * n0
        // 7n+7
        int x = (a1 * n0) + a0;
        int y = c * n0;
//        System.out.println("X : "+ x + ", Y : " + y);
        if(x <= y && a1 <= c){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}