package class3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        for (int i = 0; i < t; i++) {
            int restDollar = Integer.parseInt(br.readLine());

            int useQuarter = restDollar / quarter;
            restDollar = restDollar - (useQuarter * quarter);

            int useDime = restDollar / dime;
            restDollar = restDollar - (useDime * dime);

            int useNickel = restDollar / nickel;
            restDollar = restDollar - (useNickel * nickel);

            int usePenny = restDollar / penny;

            System.out.println(useQuarter + " " + useDime + " "  + useNickel + " "  + usePenny);
        }
    }
}