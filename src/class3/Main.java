package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        int buckets = Integer.parseInt(firstLine.nextToken());
        int throwCount = Integer.parseInt(firstLine.nextToken());

        int[] buketStatus = new int[buckets];
        for(int i = 0; i < throwCount; i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            int startBuketNum = Integer.parseInt(line.nextToken());
            int secBucketNum = Integer.parseInt(line.nextToken());
            int ballNum = Integer.parseInt(line.nextToken());

            int loopCnt = secBucketNum - startBuketNum + 1; //3
            for(int j = 0; j < loopCnt; j++){
                int changeIndex = (startBuketNum + j) - 1;
                buketStatus[changeIndex] = ballNum;
            }
        }

        for(int i = 0; i < buketStatus.length; i ++){
            System.out.print(buketStatus[i] + " ");
        }

        bw.close();
    }
}