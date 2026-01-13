package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String originWord = br.readLine();
        String[] originWordArray = originWord.split("");

        String reverseWord = "";
        for(int i = originWordArray.length - 1; i >= 0; i --){
            String word = originWordArray[i];
            reverseWord += word;
        }
        System.out.println(originWord.equals(reverseWord) ? "1" : "0");
    }
}