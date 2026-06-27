package estruturas_repeticao;

import java.util.Scanner;

public class verifica_intervalos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INTERVALO DE NUMEROS");
        System.out.print("DIGITE A QUANTIDADE DE NUMEROS NO INTERVALO:");
        int quantidadeNumeros = input.nextInt();
        int i;
        int in = 0;
        int out = 0;
        for (i = 0; i < quantidadeNumeros; i++){
            System.out.print("DIGITE O NUMERO:");
            int numero = input.nextInt();
            if (numero >= 10 && numero < 20){
                in += 1;
            }else{
                out += 1;
            }
        }
        System.out.printf("IN:%d\n", in);
        System.out.printf("OUT:%d", out);
    }
}
