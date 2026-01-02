package class3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 내 제출
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer firstLine = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(firstLine.nextToken());
//        int x = Integer.parseInt(firstLine.nextToken());
//
//        StringTokenizer secondLine = new StringTokenizer(br.readLine());
//        List<String> numbers = new ArrayList<>();
//        for(int i = 0; i < n; i ++){
//            int number = Integer.parseInt(secondLine.nextToken());
//            if(number < x){
//                numbers.add(String.valueOf(number));
//            }
//        }
//
//        bw.write(String.join(" ", numbers));
//        bw.close();

        // 2. 개선 (참고)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int x = Integer.parseInt(arr[1]);

        String[] arr2 = br.readLine().split(" ");
        for(int i = 0; i < n; i ++){
            if(Integer.parseInt(arr2[i]) < x){
                bw.write(arr2[i] + " ");
            }
        }

        bw.close();
    }
}