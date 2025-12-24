package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str);

//        int x = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(br.readLine());
//        int y = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(br.readLine());

        String result;
        if(x > 0 && y > 0){
            result = "1";
        } else if (x < 0 && y > 0){
            result = "2";
        } else if (x < 0 && y < 0) {
            result = "3";
        } else {
            result = "4";
        }

        System.out.println(result);
    }
}