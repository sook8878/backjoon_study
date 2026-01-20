package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int line = n;

        int numerator; // 분자
        int denominator; // 분모
        for(int i = 1; n > 0; i++){
            n = (n - i);
            line = i;
        }

        // 짝수 일 때
        if(line % 2 == 0){
            numerator = line + n;
            denominator = (line + 1) - numerator;
        } else {
            denominator = line + n;
            numerator = (line + 1) - denominator;
        }

        System.out.println(numerator + "/" + denominator);
    }
}