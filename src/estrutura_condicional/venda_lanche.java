package estrutura_condicional;

import java.util.Scanner;

public class venda_lanche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cachorroQuente = 4;
        double xSalada = 4.5;
        double xBacon = 5.0;
        double torrada = 2;
        double total;

        System.out.println("VENDINHA DE LANCHES:");
        System.out.print("Digite a opção de lanche:");
        int opcao = input.nextInt();
        System.out.print("Digite a quantidade do lanche:");
        int qtd = input.nextInt();

        if(opcao == 1){
            total = cachorroQuente * qtd;
            System.out.printf("Total:%.2f", total);
        } else if (opcao == 2) {
            total = xSalada * qtd;
            System.out.printf("Total:%.2f", total);
        } else if (opcao == 3) {
            total = xBacon * qtd;
            System.out.printf("Total:%.2f", total);
        } else if (opcao == 4) {
            total = torrada * qtd;
            System.out.printf("Total:%.2f", total);
        }

    }
}
