package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        String nums = br.readLine();
        int sum = 0;
        for(int i = 0; i < nums.length(); i++){
            String numStr = String.valueOf(nums.charAt(i));
            sum += Integer.parseInt(numStr);
        }

        System.out.println(sum);
    }
}