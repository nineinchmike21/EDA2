//exercicio 2
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Arrays;
import java.util.*;

import static java.lang.Integer.parseInt;
public class change {
    

    public static int change(int amount){
        for(int j = 0;j<=v;j++){
            m[j] = Integer.MAX_VALUE;
        }
        m[0] = 0;

        for (int q =1;q <= v;q++) {
            for(int i = 0;i< c.length;i++){
                if(q >= c[i] && m[q-c[i]]+1 < m[q]){
                    m[q] = 1 + m[q-c[i]];
                }
            }
        }
        return m[v];
    }

    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(input.readLine());
        String c = input.readLine();
        String[] ci = c.split(" ");

        int[] T = new int[N];
        for(int i = 0; i< ci.length;i++){
            T[i] = Integer.parseInt(ci[i]);
        }
        int Q = parseInt(input.readLine());
        //int[] m = new int[Q];
        for(int i = 0; i< Q; i++){
            int q  = Integer.parseInt(input.readLine());
            System.out.println(q + ": "+"["+ change(q,T) +"]");
        }
    }
}
