package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String[] wordArray = word.split("");

        int time = 0;
        for(int i = 0; i < wordArray.length; i++){
            int ascii = word.charAt(i);
            if(ascii == 83 || ascii >= 86){
                ascii -= 1;
                if(ascii >= 89){
                    ascii -= 1;
                }
            }

            int dialNumber = ((ascii - 65) / 3) + 2;
            time += (dialNumber + 1);
        }
        System.out.println(time);
    }
}