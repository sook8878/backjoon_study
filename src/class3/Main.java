package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(line.nextToken());
        long b = Integer.parseInt(line.nextToken());
        long v = Integer.parseInt(line.nextToken());

        long result = ((v - a) / (a - b)) + 1;
        if((v - a)%(a - b) > 0){
            result += 1;
        }
        System.out.println(result);
    }
}