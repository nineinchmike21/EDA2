import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Main {
    /*cada combinação de cores é feita na horizontal*/
    public static int mosaics(int R,int C){
        int W=0;
        if(R == 1 && C == 1) return 1;
        if((R ==2 && C== 1) || R==1 && C==2){
            return 2;
        }
        for(int i =1; i< R;i++){
            for(int j = 1; j<C; j++){
                W = 2*mosaics(i,j+1) + 2*mosaics(i+1,j);
            }
        }
        return W;
    }

    public static void main(String[] args) {
        int R = 2, C = 2;
        System.out.println(mosaics(R,C));
    }
    /*
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    private static int CARDINAL_DOMINIO = 100;
    private static int[] memoria;
    static {
        memoria = new int[CARDINAL_DOMINIO];
        memoria[1] = 1;
    }
    public static int fibonacci(int n)
    {
        if (n > 1 && memoria[n] == 0)
            memoria[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memoria[n];
    }*/
    /*
    public static int fibonacci(int n){
        int i = 0;
        int corrente=0;
        int anterior=1;
        while(i<n){
            int prox = corrente+anterior;
            anterior = corrente;
            corrente = prox;
            i++;
        }
        return corrente;
    }*//*
    public static void main(String[] args) throws IOException
    {
        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(in.readLine());
        System.out.println(fibonacci(n));
    }*/
}
