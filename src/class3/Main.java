package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double finalRating = 0;
        double creditSum = 0;
        int notPMajorCnt = 0;
        for(int i = 0; i < 20; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String major = st.nextToken();
            double rating = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P")){
                continue;
            }

            double credit = 0;
            if(grade.contains("A")){
                credit = 4;
            } else if (grade.contains("B")) {
                credit = 3;
            } else if (grade.contains("C")) {
                credit = 2;
            } else if (grade.contains("D")) {
                credit = 1;
            }

            if(grade.contains("+")){
                credit += 0.5;
            }

            creditSum += (rating * credit);
            finalRating += rating;
            notPMajorCnt += 1;
        }

        if(creditSum == 0 || finalRating == 0){
            System.out.println(0);
        } else {
            System.out.println(creditSum / finalRating);
        }
    }
}