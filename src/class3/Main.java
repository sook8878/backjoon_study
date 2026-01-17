package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] paintedArea = new int[100][100];

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 2  12
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paintedArea[j][k] = 1;
                }
            }
        }

        int count = 0;
        for(int[] a : paintedArea){
            for(int b : a){
                if(b == 1){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}