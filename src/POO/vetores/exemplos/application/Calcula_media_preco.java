package POO.vetores.exemplos.application;

import POO.vetores.exemplos.entities.Product;

import java.util.Scanner;

public class Calcula_media_preco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        Product[] array = new Product[number];

        for (int i = 0; i< array.length ;i++){
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();
            array[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < array.length ;i++){
            sum += array[i].getPrice();
        }

        double average = sum/ array.length;
        System.out.println("AVERAGE PRICE:"+ average);


    }
}
