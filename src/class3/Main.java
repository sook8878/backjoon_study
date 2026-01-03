package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = 0;
        int maxNum = 0;
        for(int i = 0; i < 9; i ++){
            int n = Integer.parseInt(br.readLine());

            if(maxNum <= n || maxNum == 0){
                maxNum = n;
                index = i+1;
            }
        }

        bw.write(maxNum + "\n" + index);
        bw.close();
    }
}