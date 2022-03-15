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
        String Qi;
        int count=0;
        Coins c = new Coins(4);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        N = parseInt(input.readLine());
        Ti = input.readLine().split(" ");
        c.setValues(Ti);
        P = parseInt(input.readLine());
        String[] Q = new String[P];
        for(int i = 0; i<P; i++){
            Qi = input.readLine();
            Q[i] = Qi;
        }
        String[] countarr = new String[P];
        /*fazer 2 fors para os arrays Ti e Qi de modo a comparar todos os valores de Ti com os de Q
        e somar os de Ti para dar um valor de Q,
        contam-se as vezes que a soma foi feita para chegar ao valor
        guarda-se o contador e dá-se reset à variável*/
        for(String num : Ti) {
            int i=0;
            for(String sum : Q) {
                int s= 0;
                c.change(parseInt(sum));
            }
            i++;
        }

        System.out.println(countarr);
    }

    static class Coins {
        public int min(int m,int n){
            int v;
            if(m < n){
                v=m;
            }else{
                v=n;
            }
            return v;
        }
        public Coins(int coins){
            int[] coins_num = new int[coins];
        }

        public void setValues(String[] v){
            v = new String[]{"1", "5", "8","11"};
        }

        public int[] change(int amount){
            int N = 4;
            int[] Q= new int[amount];
            String[] T = new String[N];
            setValues(T);
            for(int q=1; q< Q.length; q++){
                int v = Integer.MAX_VALUE;
                for(int i = 1; i<= T.length;i++){
                    if(parseInt(T[i]) < q){
                        v= min(v,1+Q[q-parseInt(T[i])]);
                    }
                }Q[q] = v;
            }
            return Q;
        }
    }
}
