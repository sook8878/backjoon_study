package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] matrix = new String[5][15];
        for (int i = 0; i < matrix.length; i++) {
            String line = br.readLine();
            String[] word = line.split("");
            for (int j = 0; j < line.length(); j++) {
                matrix[i][j] = word[j];
            }
        }

        String result = "";
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                String word = matrix[i][j];
                if(word != null){
                    result += word;
                }
            }
        }

        System.out.println(result);
    }
}