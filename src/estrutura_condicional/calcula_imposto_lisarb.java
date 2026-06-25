package estrutura_condicional;

import java.util.Scanner;

public class calcula_imposto_lisarb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULA IMPOSTO LISARB");
        System.out.print("Digite o valor em casas decimais do seu salario e descubra:");
        double salario = input.nextFloat();

        double calculo_imposto = 0;

        if (salario > 0 && salario <= 2000){
            calculo_imposto = 0.08 * salario;
        } else if (salario > 2000.01 && salario <= 3000) {
            calculo_imposto = 0.08 * salario;
        } else if (salario > 3000.1 && salario <= 4500) {
            calculo_imposto = (0.08 * 1000) + (0.18 * salario % 2);
        }else if (salario > 4500){
            calculo_imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (calculo_imposto == 0){
            System.out.println("insento");
        }else{
            System.out.printf("SALRIO:%.2f - IMPOSTO:%.2f - TOTAL:%.2f",salario, calculo_imposto, salario-calculo_imposto);
        }
    }
}
