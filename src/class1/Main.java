package class1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();

//        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int unit = num2 % 10;
        int ten = (num2 % 100) / 10;
        int hundred = num2 / 100;

        System.out.println(num1 * unit);
        System.out.println(num1 * ten);
        System.out.println(num1 * hundred);
        System.out.println(num1 * num2);
    }
}
