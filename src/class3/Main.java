package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        boolean equilateral = (a + b + c == 180);
        if(!equilateral){
            System.out.println("Error");
        } else if(equilateral && (a == 60 && b == 60 && c == 60)){
            System.out.println("Equilateral");
        } else if (equilateral && (a == b || a == c || b == c)) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}