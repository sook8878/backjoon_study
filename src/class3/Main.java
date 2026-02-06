package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer line1 = new StringTokenizer(br.readLine());
        int cardAmount = Integer.parseInt(line1.nextToken());
        int targetScore = Integer.parseInt(line1.nextToken());

        StringTokenizer line2 = new StringTokenizer(br.readLine());
        int[] cards = new int[cardAmount];
        for(int i = 0; i < cards.length; i++){
            cards[i] = Integer.parseInt(line2.nextToken());
        }

        int result = 0;
        for(int i = 0; i < cards.length; i++){
            int card1 = cards[i];

            for (int j = 0; j < cards.length; j++) {
                int card2 = cards[j];
                if(j == i){
                    continue;
                }

                for (int k = 0; k < cards.length; k++) {
                    if(k == i || k == j){
                        continue;
                    }
                    int card3 = cards[k];

                    int sumCardScore = card1 + card2 + card3;
                    if(sumCardScore == targetScore){
                        System.out.println(sumCardScore);
                        return;
                    } else if(sumCardScore <= targetScore && (sumCardScore > result)){
                        result = sumCardScore;
                    }
                }
            }
        }

        System.out.println(result);
    }
}