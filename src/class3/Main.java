package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0){
                return;
            }

            int sideSum = a+b+c;
            if((sideSum - a) <= a || (sideSum - b) <= b || (sideSum - c) <= c){
                System.out.println("Invalid");
                continue;
            }

            if (a == b && a == c) {
                System.out.println("Equilateral");
            } else if ((a == b || a == c || b == c)) {
                System.out.println("Isosceles");
            } else if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            }
        }
    }
}