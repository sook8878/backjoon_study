package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int num1 = reverseNum(st.nextToken());
        int num2 = reverseNum(st.nextToken());

        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    public static int reverseNum(String originNum){
        String[] num1StrArray = originNum.split("");
        String str1 = num1StrArray[0];
        String str3 = num1StrArray[2];
        num1StrArray[0] = str3;
        num1StrArray[2] = str1;

        String numStr = "";
        for(String num : num1StrArray){
            numStr += num;
        }

        return Integer.parseInt(numStr);
    }
}