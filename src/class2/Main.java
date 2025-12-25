package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int startH = Integer.parseInt(st.nextToken());
        int startM = Integer.parseInt(st.nextToken());
        int cookingM = Integer.parseInt(br.readLine());

        int plusM = startM + cookingM;

        if(plusM >= 60){
            int plusH = plusM / 60;
            startH += plusH;
            if(startH >= 24){
                startH = startH % 24; // 24로 나눈거에서 나머지 시간이 최종시간
            }

            startM = plusM % 60;
        } else {
            startM += cookingM;
        }

        System.out.println(startH + " " + startM);
    }
}