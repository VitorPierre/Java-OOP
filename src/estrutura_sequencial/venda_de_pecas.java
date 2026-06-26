package estrutura_sequencial;

import java.util.Scanner;

public class venda_de_pecas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o (1) Codigo da peça:");
        int id = input.nextInt();

        System.out.print("Digite o (1) Numero de peças:");
        int quantidade_pecas = input.nextInt();

        System.out.print("Digite o valor unitario da (1) peça:");
        float valor_unit = input.nextFloat();

        System.out.println("----------------------------------------------");

        System.out.print("Digite o (2) Codigo da peça:");
        int id_2 = input.nextInt();

        System.out.print("Digite o (2) Numero de peças:");
        int quantidade_pecas_2 = input.nextInt();

        System.out.print("Digite o valor unitario da (2) peça:");
        float valor_unit_2 = input.nextFloat();

        System.out.println("----------------------------------------------");

        float total_1 = (quantidade_pecas * valor_unit);
        float total_2 = (quantidade_pecas_2 * valor_unit_2);
        float valor_total = (total_1 + total_2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valor_total);

    }
}
