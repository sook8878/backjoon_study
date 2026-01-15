package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int notDuplicateWordCnt = 0;
        for(int i = 0; i < t; i++){
            String word = br.readLine();

            String[] wordArray = word.split("");

            boolean check = false;
            for(int j = 0; j < wordArray.length; j++){
                check = false;
                String currentWord = wordArray[j];

                // 1. currentWord의 갯수 알아내기
                String replaceWord = word.replaceAll(currentWord, "");
                int currentWordCnt = word.length() - replaceWord.length();

                // 2. 마지막인덱스 - 퍼스트 인덱스 != currentWord의 갯수가 아닌 알파벳이 있으면 브레이크
                int wordFirstIndex = word.indexOf(currentWord);
                int wordLastIndex = word.lastIndexOf(currentWord);

                if(wordLastIndex - wordFirstIndex == 0){
                    check = true;
                } else if(wordLastIndex - wordFirstIndex == (currentWordCnt - 1)){
                    check = true;
                }

                if(!check){
                    break;
                }
            }

            if(!check){
                continue;
            }
            notDuplicateWordCnt += 1;
        }

        System.out.println(notDuplicateWordCnt);

    }
}