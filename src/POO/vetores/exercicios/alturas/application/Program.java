package POO.vetores.exercicios.alturas.application;

import POO.vetores.exercicios.alturas.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int num = input.nextInt();
        Person person[] = new Person[num];

        for (int i = 0; i < person.length; i++){
            System.out.printf("Dados da %d pessoa:", i+1);
            System.out.print("\nNome:");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Idade:");
            int age = input.nextInt();
            System.out.print("Altura:");
            double height = input.nextDouble();
            person[i] = new Person(name,age,height);
        }

        double sumHeight = 0;
        for (int i = 0; i < person.length; i++){
            sumHeight += person[i].getHeight();
        }
        double averageHeight = sumHeight / person.length;
        System.out.printf("\nAltura Média:%.2f", averageHeight);

        double personAgeLow = 0;
        for (int i = 0; i < person.length; i++){
            if (person[i].getAge() < 16){
                personAgeLow += i;
            }
        }
        double percentageAgeLow = (personAgeLow / person.length) * 100;
        System.out.printf("\nPessoas com menos de 16 anos:%.2f", percentageAgeLow);
        System.out.print("%");

        for (int i = 0; i < person.length; i++){
            if (person[i].getAge() < 16){
                System.out.printf("\n%s", person[i].getName());
            }
        }

    }
}
