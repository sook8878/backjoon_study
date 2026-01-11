package class3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = pieceTrans(Integer.parseInt(st.nextToken()), 1);
        int q = pieceTrans(Integer.parseInt(st.nextToken()), 1);
        int r = pieceTrans(Integer.parseInt(st.nextToken()), 2);
        int b = pieceTrans(Integer.parseInt(st.nextToken()), 2);
        int kn = pieceTrans(Integer.parseInt(st.nextToken()), 2);
        int p = pieceTrans(Integer.parseInt(st.nextToken()), 8);

        System.out.println(k + " " + q + " " + r + " " + b + " " + kn + " " + p + " " );
    }

    public static int pieceTrans(int currentPieceCount, int needPieceCount){
        if(currentPieceCount > needPieceCount){
            return -(currentPieceCount - needPieceCount);
        } else if (currentPieceCount < needPieceCount) {
            return needPieceCount - currentPieceCount;
        } else {
            return 0;
        }
    }
}