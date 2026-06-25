package estrutura_condicional;

import java.util.Scanner;

public class impar_par {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para saber se e par ou impar:");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.print("NUMERO PAR");
        }else {
            System.out.print("NUMERO IMPAR");
        }
    }
}
