package estruturas_repeticao;

import java.util.Scanner;

public class planos_cartesianos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("PLANO CARTESIANO");
            System.out.print("DIGITE O EIXO X:");
            float eixoX = input.nextFloat();
            System.out.print("DIGITE O EIXO Y:");
            float eixoY = input.nextFloat();

            if (eixoX == 0 || eixoY == 0){
                break;
            } else if (eixoX == eixoY) {
                System.out.println("PRIMEIRO");
            } else if (eixoX > eixoY) {
                System.out.println("QUARTO");
            } else if (eixoX < 0 && eixoY < 0) {
                System.out.println("TERCEIRO");
            } else if (eixoX < 0 && eixoY > 0) {
                System.out.println("SEGUNDO");
            }
        }
    }
}
