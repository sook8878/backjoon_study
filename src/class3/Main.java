package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] alphabets = new String[26];
        int index = 0;
        for (int i = 97; i < 123; i++){
            char alphabet = (char) i;
            alphabets[index] = String.valueOf(alphabet);
            index++;
        }

        for(int i = 0; i < alphabets.length; i++){
            String alphabet = alphabets[i];
            System.out.print(s.indexOf(alphabet) + " ");
        }
    }
}