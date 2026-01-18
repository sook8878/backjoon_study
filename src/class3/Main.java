package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken();
        int nBase = Integer.parseInt(st.nextToken());

        long result = 0;
        int index = 0;
        for (int i = word.length()-1; i >= 0; i--) {
            int num;
            if (word.charAt(i) >= 65){
                num = word.charAt(i) - 55;
            } else {
                num = word.charAt(i) - 48;
            }

            long baseResult = (long) Math.pow(nBase, index++);
            result += ((long) num * baseResult);
        }
        System.out.println(result);
    }
}