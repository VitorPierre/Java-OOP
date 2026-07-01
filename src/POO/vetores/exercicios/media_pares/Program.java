package POO.vetores.exercicios.media_pares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Quantos elementos vai ter o vetor? :");
        int quantity = input.nextInt();
        double nums[] = new double[quantity];

        for (int i = 0; i < nums.length; i++){
            System.out.print("Digite um numero:");
            nums[i] = input.nextDouble();
        }

        double sumEven = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                sumEven+= nums[i];
                count += 1;
            }

        }

        double averageEven = sumEven/ count;
        if (sumEven > 0){
            System.out.printf("MEDIA DOS PARES = %.2f", averageEven);
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }







    }
}
