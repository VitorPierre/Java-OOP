package estruturas_repeticao;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }
    }
}
