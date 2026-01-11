package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine().trim();
        String[] wordArray = sentence.split(" ");

        int result = wordArray.length;
        if(sentence.isBlank()){
            result = 0;
        }

        System.out.println(result);
    }
}