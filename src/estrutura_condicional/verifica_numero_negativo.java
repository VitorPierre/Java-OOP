package estrutura_condicional;

import java.util.Scanner;

public class verifica_numero_negativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int num = input.nextInt();

        if(num < 0){
            System.out.print("NUMERO NEGATIVO");
        }else{
            System.out.print("NUMERO POSITIVO");
        }


    }
}
