package estrutura_sequencial;

import java.util.Scanner;

public class descobre_area_raio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do raio de um circulo:");
        double raio = input.nextDouble();

        double PI = 3.14159F;

        double formula_area_circulo = (PI * Math.pow(raio, 2));

        System.out.printf("A = %.4f" , formula_area_circulo);
    }
}
