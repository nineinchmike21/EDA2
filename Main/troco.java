import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class troco{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String coins = br.readLine();
        String[] str = coins.split(" ");

        int[] T = new int[N];
        for (int i = 0; i < str.length; i++) {
            T[i] = Integer.parseInt(str[i]);
        }

        int P = Integer.parseInt(br.readLine());


        for (int i = 0; i < P; i++){
            int pergunta = Integer.parseInt(br.readLine());
            System.out.println(pergunta + ": " + "[" + troco(pergunta, T) + "]");
        }

    }

    public static int troco(int valor, int[] moedas) {
        int[] troco = new int[valor + 1];

        for (int j = 0; j <= valor; j++) {
            troco[j] = Integer.MAX_VALUE;
        }
        troco[0] = 0;

        for (int i = 0; i <= valor; i++) {
            for (int j = 0; j < moedas.length; j++) {
                if (i >= moedas[j] && troco[i - moedas[j]] + 1 < troco[i]) {
                    troco[i] = 1 + troco[i - moedas[j]];
                }
            }
        }
        return troco[valor];
    }
}