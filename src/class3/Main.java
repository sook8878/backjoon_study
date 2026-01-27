package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(line.nextToken());
        int y = Integer.parseInt(line.nextToken());

        int w = Integer.parseInt(line.nextToken());
        int h = Integer.parseInt(line.nextToken());

        int xDistance = w - x;
        int yDistance = h - y;

        int[] arr = new int[]{xDistance, yDistance, x, y};
        int minNum = 0;
        for(int num : arr){
            if(num < minNum || minNum == 0){
                minNum = num;
            }
        }
        System.out.println(minNum);
    }
}