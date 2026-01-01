package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        String numbers = br.readLine();
        StringTokenizer st = new StringTokenizer(numbers);

        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < t; i ++){
            int number = Integer.parseInt(st.nextToken());
            if(number == v){
                count += 1;
            }
        }
        bw.write(count + "");
        bw.close();
    }
}