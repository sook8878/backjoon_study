package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line);
            double a = Integer.parseInt(st.nextToken());
            double b = Integer.parseInt(st.nextToken());
            if(a == 0 || b == 0){
                return;
            }
            boolean factor = (b % a == 0);
            boolean multiple = ((a / b) % 1 == 0); // a % b == 0 이 정답
            if(factor){
                System.out.println("factor");

            } else if (multiple) {
                System.out.println("multiple");

            } else {
                System.out.println("neither");
            }
        }
    }
}