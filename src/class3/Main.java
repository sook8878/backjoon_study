package class3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String originWord = br.readLine().toUpperCase();
        String[] wordSplit = originWord.split("");

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String splitWord : wordSplit) {
            Integer wordCount = wordCountMap.get(splitWord);
            if(wordCount == null){
                wordCountMap.put(splitWord, 1);
            } else {
                wordCountMap.put(splitWord, ++wordCount);
            }

        }

        int maxCount = 0;
        String maxWord = "";
        for(String key : wordCountMap.keySet()){
            int cnt = wordCountMap.get(key);
            if(cnt > maxCount){
                maxCount = cnt;
                maxWord = key;
            } else if (cnt == maxCount) {
                maxWord += key;
            }
        }
        System.out.println(maxWord.length() > 1 ? "?" : maxWord);
    }
}