package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        String result;
        if(num1 > num2){
            result = ">";
        } else if (num1 < num2) {
            result = "<";
        } else {
            result = "==";
        }

        System.out.println(result);
    }
}