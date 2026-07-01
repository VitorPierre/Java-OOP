package POO.vetores.exercicios.aprovados;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? :");
        int quantity =  input.nextInt();
        String name[] = new String[quantity];
        double note[] =  new double[quantity];
        double notes[] = new double[quantity];

        for (int i = 0; i < name.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n",i+1);
            input.nextLine();
            name[i] = input.nextLine();
            note[i] = input.nextDouble();
            note[i] = input.nextDouble();
            notes[i] = note[i] + note[i];
        }

        System.out.println("Alunos aprovados:");
        double average = 0;
        for (int i = 0; i < notes.length; i++){
            if (notes.length == 0){
                System.out.println("NENHUMA NOTA NO SISTEMA");
            }
            average = notes[i] / 2;

            if(average >= 6){
                System.out.printf("%s%n",name[i]);
            }
        }

    }
}
