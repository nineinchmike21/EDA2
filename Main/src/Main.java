import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException{
        int N;
        String[] Ti;
        int P;
        int Qi;
        int sum;
        int x;
        int y;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N= parseInt(in.readLine());
        Ti = in.readLine().split(" ",N);
        P = parseInt(in.readLine());
        //int[] count = new int[P];
        int[][] solucao = new int[sum+1][N];
        for(int s =0;s<N;s++){
            solucao[0][s] = 1;
        }
        //String[] Q = new String[P];
        for(int i = 0; i< P;i++){
            Qi = parseInt(in.readLine());
            sum = Qi;
        }
        for(int s = 0; s < sum; s++){
            for(int j= 0;j < N;j++){
                x =(s- parseInt(Ti[j]) >=0) ? solucao[s- parseInt(Ti[j])][j] : 0;

                y = (j >= 1) ? solucao[s][j-1] : 0;

                solucao[s][j] = x + y;
            }
        }
        System.out.println(solucao[sum][N-1]);
    }
}
