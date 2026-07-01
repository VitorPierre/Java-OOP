package POO.vetores.exercicios.abaixo_da_media;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? :");
        int nums = input.nextInt();
        double real[] = new double[nums];

        double sum = 0;
        for (int i = 0; i < real.length; i++){
            System.out.print("Digite um numero:");
            real[i] = input.nextDouble();
            sum += real[i];
        }
        double average = sum / real.length;
        System.out.printf("MEDIA DO VETOR = %.3f", average);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < real.length; i++){
            if (real[i] < average){
                System.out.printf("%.2f%n", real[i]);
            }
        }


    }
}
