package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer line1 = new StringTokenizer(br.readLine());
        StringTokenizer line2 = new StringTokenizer(br.readLine());
        StringTokenizer line3 = new StringTokenizer(br.readLine());
        int p1_x = Integer.parseInt(line1.nextToken());
        int p1_y = Integer.parseInt(line1.nextToken());

        int p2_x = Integer.parseInt(line2.nextToken());
        int p2_y = Integer.parseInt(line2.nextToken());

        int p3_x = Integer.parseInt(line3.nextToken());
        int p3_y = Integer.parseInt(line3.nextToken());

        int x = 0;
        if(p1_x == p2_x){
            x = p3_x;
        } else if (p2_x == p3_x) {
            x = p1_x;
        } else if (p1_x == p3_x) {
            x = p2_x;
        }

        int y = 0;
        if(p1_y == p2_y){
            y = p3_y;
        } else if (p2_y == p3_y) {
            y = p1_y;
        } else if (p1_y == p3_y) {
            y = p2_y;
        }

        System.out.println(x + " " + y);
    }
}