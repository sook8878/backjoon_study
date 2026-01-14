package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String croatiaWord = br.readLine();

        String[] croatiaAlphabetArray = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        int croWordLength = 0;
        for(String croAlphabet : croatiaAlphabetArray){
            int originCroWordLength = croatiaWord.replaceAll(" ", "").length();
            croatiaWord = croatiaWord.replaceAll(croAlphabet," ");

            croWordLength = croWordLength + ((originCroWordLength - croatiaWord.replaceAll(" ", "").length()) / croAlphabet.length());
        }
        System.out.println((croWordLength + croatiaWord.replaceAll(" ","").length()));
    }
}