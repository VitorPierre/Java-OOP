package estrutura_condicional;

import java.util.Scanner;

public class plano_cartesiano {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLANO CARTESIANO");

        System.out.print("Digite o valor do eixo X:");
        float eixoX = input.nextFloat();
        System.out.print("Digite o valor do eixo Y:");
        float eixoY = input.nextFloat();

        if (eixoX == eixoY) {
            System.out.println("ORIGEM");
        } else if (eixoX == 0) {
            System.out.println("EIXO X");
        } else if (eixoY== 0) {
            System.out.println("EIXO Y");
        } else if (eixoX % eixoY == 0){
            System.out.println("Q1");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.println("Q2");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.println("Q3");
        } else{
            System.out.println("Q4");
        }
    }
}
