package estruturas_repeticao;

import java.util.Scanner;

public class preferencias_posto_gasolina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true){
            System.out.println();
            System.out.println("PESQUISA DE PREFERENCIA\n" +
                    "1 - ALCOOL\n" +
                    "2 - GASOLINA\n" +
                    "3 - DIESEL\n" +
                    "4 - ENCERRAR");
            System.out.print("DIGITE UMA OPÇÃO:");
            int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    alcool += 1;
                    System.out.println("VOCÊ VOTOU EM ALCOOL");
                    break;
                case 2:
                    gasolina += 1;
                    System.out.println("VOCÊ VOTOU EM GASOLINA");
                    break;
                case 3:
                    diesel += 1;
                    System.out.println("VOCÊ VOTOU EM DIESEL");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("MUITO ORBIGADO!");
                    System.out.printf("VOTOS ALCOOL:%d\n", alcool);
                    System.out.printf("VOTOS GASOLINA:%d\n", gasolina);
                    System.out.printf("VOTOS DIESEL:%d", diesel);
                    System.exit(1);
                default:
                    System.out.println("DIGITE NUMEROS DE 1 A 4");
            }
        }
    }
}
