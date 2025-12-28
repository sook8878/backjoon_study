package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCost = Integer.parseInt(br.readLine());
        int buyCount = Integer.parseInt(br.readLine());

        int cost = 0;
        for(int i = 0; i < buyCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tempCost = Integer.parseInt(st.nextToken());
            int tempCount = Integer.parseInt(st.nextToken());

            cost += (tempCost * tempCount);
        }

        String result = cost == totalCost ? "Yes" : "No";
        System.out.println(result);
    }
}