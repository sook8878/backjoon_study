package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(firstLine.nextToken());
        int m = Integer.parseInt(firstLine.nextToken());

        int[][] matrix = new int[n][m];
        for(int i = 0; i < (n * 2); i ++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            int index = i;
            if(index >= n){
                index = i - n;
            }

            for(int j = 0; j < m; j++){
                int num = Integer.parseInt(line.nextToken());
                matrix[index][j] += num;
            }
        }

        for(int[] array : matrix){
            for(int num : array){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}