package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scoreArray = new int[n];
        int highestScore = 0;
        for(int i = 0; i < n; i ++){
            int score = Integer.parseInt(st.nextToken());
            scoreArray[i] = score;

            if(highestScore <= score || highestScore == 0){
                highestScore = score;
            }
        }

        double[] fakeScoreArray = new double[n];
        for(int i = 0; i < n; i ++){
            fakeScoreArray[i] = ((double) scoreArray[i] / highestScore * 100);
        }

        double average = 0;
        for(double i : fakeScoreArray){
            average += i;
        }

        bw.write(String.valueOf(average / n));
        bw.close();
    }
}