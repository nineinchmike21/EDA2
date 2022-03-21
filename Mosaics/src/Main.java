import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Main {
    //int a,p;
    /*cada combinação de cores é feita na horizontal*/
    public static int mosaics(int R,int C){
        int c1 = 0,c2 = 0, c3=0;
        char cor1,cor2,cor3,res;
        int W=0, w1,w2,w3;
        /*é preciso um contador para cada cor, assume-se que o maximo de cores é 3*/
        /*calculadas as vezes que uma cor se repete, deve-se em seguida 
        calcular o numero máximo de combinações possíveis para essa cor(usando o contador)*/
        for(int i =1; i < R;i++){ /*ele itera linha a linha*/
            for(int j = 1; j<C; j++){ /*coluna a coluna*/ 
                if( cor == "R"){ /*vê o valor que está na coluna e adiciona ao contador, cada contador corresponde 
                 a uma cor*/
                    c1 += 1;
                }
                else if(cor = "G") c2 += 1;
                else if(cor == "Y") c3 += 1;

                /*W = (int) Math.pow(2,mosaics(i,j+i)) + 2*mosaics(i+1,j);*/
            }
            w1 = Math.pow(2,c1);/*calcula o nº de combinações de uma cor*/
            w2 = Math.pow(2,c2);
            w3 = Math.pow(2,c3);
            c1 = 0; /*reset dos contadores*/
            c2 = 0;
            c3 = 0;
            res = w1+w2+w3; /*soma das combinações para uma linha*/
            W += res; /*o resultado da linha é adicionado ao W*/
        }

        
        /*for(int j = 1;j<R;j++){
            for(i = 1; i<C;i++){

            }
        }*/

        return W;
    }

    public static void main(String[] args) {
        int R = 3, C = 3;
        for(int i =1; i < R;i++){
            for(int j = 1; j<C; j++){
                

                /*W = (int) Math.pow(2,mosaics(i,j+i)) + 2*mosaics(i+1,j);*/
            }
        }
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
