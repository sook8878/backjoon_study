package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num = Long.parseLong(st.nextToken());
        int nBase = Integer.parseInt(st.nextToken());

        String result = "";
        while (num > 0){
            int modWord = (int) (num % nBase);
            if(modWord > 9){
                char c = (char) (modWord + 55);
                result = (c + result);
            } else {
                result = (modWord + result);
            }
            num = (num / nBase);
        }
        System.out.println(result);
    }
}