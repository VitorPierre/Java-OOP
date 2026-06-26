package estrutura_sequencial;

import java.util.Scanner;

public class calculos_geometricos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor:");
        double a = input.nextDouble();

        System.out.print("Digite o primeiro valor:");
        double b = input.nextDouble();

        System.out.print("Digite o primeiro valor:");
        double c = input.nextDouble();

        double PI = 3.14159F;
        double area_triangulo_retangulo = (a * c / 2);
        double area_circulo = (PI * Math.pow(c, 2));
        double area_trapezio = (a + b) * c / 2;
        double area_quadrado = Math.pow(b, 2);
        double area_retangulo = (a * b);

        System.out.printf("TRIANGULO: %.4f\n", area_triangulo_retangulo);
        System.out.printf("CIRCULO: %.4f\n", area_circulo);
        System.out.printf("TRAPEZIO: %.4f\n", area_trapezio);
        System.out.printf("QUADRADO: %.4f\n", area_quadrado);
        System.out.printf("RETANGULO: %.4f\n", area_retangulo);
    }
}
