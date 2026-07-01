package POO.vetores.exercicios.verifica_negativos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar?");
        int num = input.nextInt();
        int nums[] = new int[num];
        for (int i = 0; i < nums.length; i++){
            System.out.print("Digite um numero:");
            nums[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                System.out.printf("%d%n",nums[i]);
            }
        }

    }
}
