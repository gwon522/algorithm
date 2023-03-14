package beakjoon.class2.normal;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class RefillChessboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split(" ");
        //m과 n 입력받음
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);

        //체스판 입력받음
        String [] inputBoard = new String[m];
        for (int i = 0; i < m; i++) {
            inputBoard[i]=br.readLine().trim();
        }
        br.close();

        int answer = Integer.MAX_VALUE;
        //m n 8 8
        for (int i = 0; i <= m-8; i++) {
            for (int j = 0; j <= n-8; j++) {
                int curAnswer = getSolution(i,j,inputBoard);
                answer = answer > curAnswer?curAnswer : answer;
            }
        }
    }

    public static int getSolution(int startRow, int startCol, String[] board){
        String [] wb = {"WBWBWBWB","BWBWBWBW"};
        int whiteAnswer = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                if(board[row].charAt(col)!=wb[row%2].charAt(j)){
                    whiteAnswer++;
                }
            }
        }

        return Math.min(whiteAnswer,64-whiteAnswer);
    }
}
