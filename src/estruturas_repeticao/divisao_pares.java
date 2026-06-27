package estruturas_repeticao;

import java.util.Scanner;

public class divisao_pares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("DIVISÕES IMPOSSIVEIS");
        System.out.print("DIGITE A QUANTIDADE DE DIVISÕES:");
        int entrada = input.nextInt();
        for (int i = 0; i < entrada; i++){
            System.out.println();
            System.out.print("DIGITE O PRIMEIRO NUMERO:");
            int numeroUm = input.nextInt();
            System.out.print("DIGITE O SEGUNDO NUMERO:");
            int numeroDois = input.nextInt();

            if (numeroDois == 0){
                System.out.println("DIVISÃO IMPOSSIVEL POR ZERO");
            }

            float divisao = (numeroUm / numeroDois);


            System.out.printf("%f", divisao);

        }
    }
}
