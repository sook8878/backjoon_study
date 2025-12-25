package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int minusM = m - 45;
        if(minusM < 0){
            m = 60 + minusM;
            h -= 1;
        } else {
            m = minusM;
        }

        if(h < 0){
            h = 23;
        }

        System.out.println(h + " " + m);
    }
}