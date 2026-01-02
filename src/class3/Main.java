package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");
        int min = 0;
        int max = 0;
        for(int i = 0; i < n; i ++){
            int number = Integer.parseInt(numbers[i]);

            if(min >= number || min == 0){
                min = number;
            }

            if(max <= number || max == 0){
                max = number;
            }
        }

        bw.write(min + " " + max);
        bw.close();
    }
}