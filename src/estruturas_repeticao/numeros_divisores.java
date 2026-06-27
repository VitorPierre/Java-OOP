package estruturas_repeticao;

import java.util.Scanner;

public class numeros_divisores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                System.out.printf("%d\n",i);
            }
        }
    }
}
