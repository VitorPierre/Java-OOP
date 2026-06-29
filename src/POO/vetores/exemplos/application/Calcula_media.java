package POO.vetores.exemplos.application;

import java.util.Scanner;

public class Calcula_media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        double[] array = new double[number];

        //insert nums in array
        for (int i = 0; i < number; i++){
            array[i] = input.nextDouble();
        }

        // sum all numbers in array
        double sum = 0;
        for (int i = 0; i < number; i++){
            sum += array[i];
        }

        //all nums in array average number
        double average = sum / number;
        System.out.printf("AVERAGE HEIGHT:"+ average);
    }
}
