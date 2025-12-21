package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        double num1 = Integer.parseInt(st.nextToken());
        double num2 = Integer.parseInt(st.nextToken());

        System.out.println(num1 / num2);
    }
}
