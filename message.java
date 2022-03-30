import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int[] pecas = {1,2,3,4,6,8,10,12,16};

    private static long calcula(int tamanho_peca,long[]possibilidades) {              //funÃ§Ã£o que devolve o valor das possibilidades dado o tamanho da peÃ§a
        if(possibilidades[tamanho_peca] == 0) {                   //se o valor do tamanho_peca ja estiver no array nÃ£o Ã© calculado
            for (int i = 1; i <= tamanho_peca; i++) {             //ciclo que percorre todas as possibilidades atÃ© tamanho_peca
                if (possibilidades[i] == 0) {                     //se o valor ja estiver no array nÃ£o Ã© calculado novamente
                    for (int peca : pecas) {
                        if (i - peca > 0) {
                            possibilidades[i] = possibilidades[i] + possibilidades[i - peca];
                        } else if (i == peca) {
                            possibilidades[i] = possibilidades[i] + 1;
                        } else break;
                    }
                }
            }
        }
        return possibilidades[tamanho_peca];
    }
/*O(tamanho_peca)*O(peca)*/

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String [] board = in.readLine().split(" ");
        int lines = Integer.parseInt(board[0]);             //numero de linhas
        int cols = Integer.parseInt(board[1]);              //numero de colunas
        long[] possibilidades = new long[cols+1];             //array que guarda as possibilidades para os varios tamanhos de peÃ§as
        long resultado=1;                                   //caso base
        for(int i = 0;i < lines;i++){                       //percorrer as linhas
            String linha = in.readLine();
            int contador=1;
            for(int k = 0;k < cols-1;k++) {                 //percorrer os chars da linha
                if(linha.charAt(k)!='.' && linha.charAt(k) == linha.charAt(k+1)) {    //se o char for != '.' e igual ao char seguinte
                    contador++;
                }
                else {
                    resultado = resultado * calcula(contador,possibilidades);  //resultado da sequencia de chars
                    contador = 1;                               //resetar contador
                }
            }
            resultado = resultado * calcula(contador,possibilidades);          //resultado da sequencia de chars que ficou fora do ciclo
        }
        System.out.println(resultado);
    }
}
/*resultado=tamanho_peca*pecas*/
/*O(resultado)*O(lines)*O(cols)*/