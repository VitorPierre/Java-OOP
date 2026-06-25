package estrutura_condicional;

import java.util.Scanner;

public class descobre_multiplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Descobre multiplo");
        System.out.print("Digite o primeiro numero:");
        int numero_1 = input.nextInt();
        System.out.print("Digite o segundo numero:");
        int numero_2 = input.nextInt();

        if(numero_2 == 0){
            System.out.print("O divisor não pode ser zero");
        }

        if(numero_1 % numero_2 == 0 || numero_2 % numero_1 == 0 ){
            System.out.print("SÃO MULTIPLOS");
        }else{
            System.out.print("NÃO MULTIPLOS");
        }
    }
}
