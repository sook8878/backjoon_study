package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine;
        while ((readLine = br.readLine()) != null){
            if(readLine == null || readLine.isEmpty()){
                return;
            }
            StringTokenizer st = new StringTokenizer(readLine);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }
    }
}