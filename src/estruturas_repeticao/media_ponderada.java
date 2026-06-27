package estruturas_repeticao;

import java.util.Scanner;

public class media_ponderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NUMERO DE CASOS");
        System.out.print("DIGITE O NUMERO DE CASOS:");
        int numeroCasos = input.nextInt();
        for (int i = 0; i < numeroCasos; i++){
            System.out.println();
            System.out.print("DIGITE O PRIMEIRO VALOR:");
            float primeiroValor = input.nextFloat();
            System.out.print("DIGITE O SEGUNDO VALOR:");
            float segundoValor = input.nextFloat();
            System.out.print("DIGITE O TERCEIRO VALOR:");
            float terceiroValor = input.nextFloat();

            float media = (primeiroValor * 2 + segundoValor * 3 + terceiroValor * 5) / 10;
            System.out.printf("MEDIA:%.1f",media);
        }
    }
}
