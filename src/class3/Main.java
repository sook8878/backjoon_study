package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int loopCount = n/4;
        String result = "";
        for(int i = 0; i < loopCount; i++){
            result += "long ";
        }

        System.out.println(result + "int");
    }
}