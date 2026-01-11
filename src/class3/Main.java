package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine;
        while ((readLine = br.readLine()) != null){
            System.out.println(readLine);
        }
    }
}