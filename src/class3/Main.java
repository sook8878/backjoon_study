package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine;
        while ((readLine = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(readLine);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0){
                return;
            } else {
                System.out.println(a+b);
            }
        }
    }
}