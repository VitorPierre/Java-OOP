package POO.vetores.exercicios.soma_vetor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros ira digitar? ");
        int num = input.nextInt();
        double nums[] = new double[num];

        for (int i = 0; i < nums.length; i++){
            System.out.print("Digite um numero:");
            nums[i] = input.nextDouble();
        }

        System.out.printf("VALORES = ");
        double sum = 0;
        for (int i = 0; i < nums.length; i++ ){
            sum += nums[i];
            System.out.printf("%.1f ", nums[i]);
        }
        double average = sum / nums.length;
        System.out.print("\nSOMA = " + sum);
        System.out.print("\nMEDIA = " + average);


    }
}
