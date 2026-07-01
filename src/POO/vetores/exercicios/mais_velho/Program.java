package POO.vetores.exercicios.mais_velho;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? :");
        int quantity = input.nextInt();
        int people[] = new int[quantity];
        String name[] = new String[quantity];
        int age[] = new int[quantity];


        for (int i = 0; i < people.length; i++){
            System.out.printf("Dados da %da pessoa:", i+1);
            System.out.print("\nNome:");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Idade:");
            age[i] = input.nextInt();
        }

        double highAge = 0;
        int indexNameAge = 0;
        for (int i = 0; i < age.length; i++){
            if (age[i] > highAge){
                highAge = age[i];
                indexNameAge = i;
            }
        }
        System.out.printf("Pessoa mais velha:%s%n", name[indexNameAge]);



    }
}
