package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            String result = "";
            for(int k = 0; k < str.length(); k ++){
                String ch = str.substring(k, k+1);
                for (int j = 0; j < r; j ++){
                    result = result + ch;
                }
            }
            System.out.println(result);
        }

    }
}