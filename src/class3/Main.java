package class3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());
            int mode = n % 42;
            map.put(mode, mode);
        }

        bw.write(map.size() + "");

        bw.close();
    }
}