package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[9][9];
        int maxNum = 0;
        int row = 0;
        int column = 0;
        for(int i = 0; i < matrix.length; i++){
            StringTokenizer line = new StringTokenizer(br.readLine());

            for(int j = 0; j < matrix[i].length; j++){
                int num = Integer.parseInt(line.nextToken());
                if(maxNum <= num){
                    maxNum = num;
                    row = i+1;
                    column = j+1;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(row + " " + column);
    }
}