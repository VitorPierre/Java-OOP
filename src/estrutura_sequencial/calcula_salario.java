package estrutura_sequencial;

import java.util.Scanner;

public class calcula_salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu ID:");
        int id = input.nextInt();

        System.out.print("Digite suas horas trabalhadas:");
        int horas_trabalhadas = input.nextInt();

        System.out.print("Digite o valor trabalhado por hora:");
        float valor_hora = input.nextFloat();

        float calculo_salario = (horas_trabalhadas * valor_hora);

        System.out.printf("NUMBER = %d\nSALARY = %.2f", id, calculo_salario);

    }
}
