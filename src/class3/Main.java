package class3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> studentsList = new ArrayList<>();
        for(int i = 0; i < 30; i++){
            studentsList.add((i + 1) + "");
        }

        for(int i = 0; i < 28; i ++){
            studentsList.remove(br.readLine());
        }

        for(String n : studentsList){
            bw.write(n + "\n");
        }
        bw.close();
    }
}