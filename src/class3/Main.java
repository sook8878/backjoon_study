package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String star = "";

            for(int j = 0; j < t; j++){
                if(j >= t-1-i){
                    star += "*";
                } else {
                    star += " ";
                }
            }
            bw.write(star+"\n");
        }

        bw.close();
    }
}