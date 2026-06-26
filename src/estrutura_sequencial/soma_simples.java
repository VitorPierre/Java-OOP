package estrutura_sequencial;

import java.util.Scanner;

public class soma_simples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Primeiro numero:");
        int numero_1 = input.nextInt();
        System.out.print("Digite o Segundo numero:");
        int numero_2 = input.nextInt();

        int total = numero_1 + numero_2;

        System.out.println("SOMA = " + total);
    }
}