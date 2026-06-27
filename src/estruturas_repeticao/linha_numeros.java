package estruturas_repeticao;

import java.util.Scanner;

public class linha_numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int entrada = input.nextInt();
        for(int i = 1; i <= entrada; i++){
            int primeira = i;
            int segunda = i*i;
            int terceira = i*i*i;
            System.out.printf("%d %d %d\n", primeira, segunda, terceira);
        }
    }
}
