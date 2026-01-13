package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int loopCnt = n * 2;

        for(int i = 1; i < n * 2; i++){
            String starLine = "";

            int checkCnt = loopCnt - i;
            int starCnt;
            if(checkCnt > n){
                starCnt =  i * 2 - 1;
            } else if (checkCnt < n) {
                starCnt = (loopCnt - i) * 2 - 1;
            } else {
                starCnt = loopCnt - 1;
            }

            int blankCnt = (loopCnt - 1 - starCnt) / 2;
            for(int j = 0; j < blankCnt; j++){
                starLine += " ";
            }
            for(int j = 0; j < starCnt; j++){
                starLine += "*";
            }
            System.out.println(starLine);
        }
    }
}