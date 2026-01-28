package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int sideSum = a+b+c;
        if ((sideSum - a) <= a) {
            a = b + c - 1;
        } else if ((sideSum - b) <= b) {
            b = a + c - 1;
        } else if ((sideSum - c) <= c){
            c = a + b - 1;
        }

        System.out.println(a + b + c);
    }
}