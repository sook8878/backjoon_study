package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        if(n == 1){
            System.out.println(1);
            return;
        }

        long check = 0;
        long count = 0;
        for(long i = 6; i > 0; i = (i+6)){
            check += (i);

            if((n - check) <= 1){
                break;
            }

            count ++;
        }
        System.out.println((count+2));
    }
}