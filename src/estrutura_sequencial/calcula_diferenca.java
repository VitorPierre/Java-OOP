package estrutura_sequencial;

import java.util.Scanner;

public class calcula_diferenca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Primeiro numero:");
        int a = input.nextInt();

        System.out.print("Digite o Segundo numero:");
        int b = input.nextInt();

        System.out.print("Digite o Terceiro numero:");
        int c = input.nextInt();

        System.out.print("Digite o Quarto numero:");
        int d = input.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("Diferença = " + diferenca);


    }
}
