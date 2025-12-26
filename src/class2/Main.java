package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int diceA = Integer.parseInt(st.nextToken());
        int diceB = Integer.parseInt(st.nextToken());
        int diceC = Integer.parseInt(st.nextToken());

        int reward;
        // 1. 다 맞을 경우
        if (diceA == diceB && diceA == diceC){
            reward = 10000 + (diceA * 1000);
        } else if (diceA == diceB || diceA == diceC || diceB == diceC) {
            // 2개만 맞을 경우
            // 뭐랑 맞았는지 체크
            int checkDice;
            if (diceA == diceB){
                checkDice = diceA;
            } else if (diceA == diceC) {
                checkDice = diceA;
            } else {
                checkDice = diceC;
            }
            reward = 1000 + (checkDice * 100);
        } else {
            // 다 틀릴 경우
            // 높은 거 찾기
            int heightDice = diceA;
            if(diceB > diceA){
                heightDice = diceB;
            }
            if(diceC > heightDice){
                heightDice = diceC;
            }

            reward = heightDice * 100;
        }

        System.out.println(reward);
    }
}