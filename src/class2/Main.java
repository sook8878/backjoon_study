package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(st.nextToken());

        String result;
        if(num1 >= 90){
            result = "A";
        } else if (num1 <= 89 && num1 >= 80) {
            result = "B";
        } else if (num1 <= 79 && num1 >= 70) {
            result = "C";
        } else if (num1 <= 69 && num1 >= 60){
            result = "D";
        } else {
            result = "F";
        }

        System.out.println(result);
    }
}