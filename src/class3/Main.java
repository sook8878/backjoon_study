package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n < 2){
            System.out.println(0);
            return;
        }

        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer line = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(line.nextToken());
            int y = Integer.parseInt(line.nextToken());

            if(minX > x || minX == 0){
                minX = x;
            }
            if(maxX < x || maxX == 0){
                maxX = x;
            }

            if(minY > y || minY == 0){
                minY = y;
            }
            if(maxY < y || maxY == 0){
                maxY = y;
            }
        }

        int extent = ((maxX - minX) * (maxY - minY));
        System.out.println(extent);
    }
}