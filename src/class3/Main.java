package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            String s = br.readLine();
            System.out.println(s.substring(0,1) + "" + s.substring(s.length()-1, s.length()));
        }
    }
}