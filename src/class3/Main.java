package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        int buckets = Integer.parseInt(firstLine.nextToken());
        int changeCount = Integer.parseInt(firstLine.nextToken());

        int[] bucketStatus = new int[buckets];
        for(int i = 0; i<bucketStatus.length; i++){
            bucketStatus[i] = i+1;
        }

        for(int i = 0; i < changeCount; i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            int startBuketNum = Integer.parseInt(line.nextToken());
            int secBucketNum = Integer.parseInt(line.nextToken());

            for(int j = 0; j < (secBucketNum - startBuketNum); j++){
                int startIndex = startBuketNum - 1 + j;
                int secIndex = secBucketNum - 1 - j;
                if(startIndex > secIndex){
                    continue;
                }
                int startBuketNumOrigin = bucketStatus[startIndex];
                int secBucketNumOrigin = bucketStatus[secIndex];
                bucketStatus[startIndex] = secBucketNumOrigin;
                bucketStatus[secIndex] = startBuketNumOrigin;
            }
        }
        for(int i = 0; i < bucketStatus.length; i ++){
            bw.write(bucketStatus[i] + " ");
        }

        bw.close();
    }
}