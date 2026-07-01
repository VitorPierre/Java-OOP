package POO.vetores.exercicios.dados_pessoas;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? :");
        int quantity = input.nextInt();
        int person[] = new int[quantity];
        String gender[] = new String[quantity];
        double height[] = new double[quantity];

        int numberOfMen = 0;
        for (int i = 0; i < person.length; i++) {
            System.out.printf("Altura da %da pessoa:", i+1);
            height[i] = input.nextDouble();
            System.out.printf("Genero da %da pessoa:", i+1);
            input.nextLine();
            gender[i] =  input.nextLine();


            if (gender[i].equals("M")){
                numberOfMen+=1;
            }
        }


        double heightOfWoman = 0;
        int quantityWomans = 0;
        for (int i = 0; i < height.length; i++){
            if (gender[i].equals("F")){
                heightOfWoman += height[i];
                quantityWomans +=1;
            }
        }
        double averageHeightOfWoman = heightOfWoman / quantityWomans;


        double minimumHeight = height[0];
        double greatestHeight = height[0];
        for (int i = 0; i < height.length;i++){
            if(height[i] > greatestHeight){
                greatestHeight = height[i];
            }

            if (height[i] < minimumHeight){
                minimumHeight = height[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", minimumHeight);
        System.out.printf("Maiot altura = %.2f%n", greatestHeight);
        System.out.printf("Media das alturas das mulheres = %.2f%n", averageHeightOfWoman);
        System.out.printf("Numero de homens = %d%n", numberOfMen);
    }
}
