package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(st.nextToken());

        boolean isLeapYear = (num1 % 4 == 0 && num1 % 100 != 0) || (num1 % 4 == 0 && num1 % 400 == 0);

        String result;
        if(isLeapYear){
            result = "1";
        } else {
            result = "0";
        }

        System.out.println(result);
    }
}