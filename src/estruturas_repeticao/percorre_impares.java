package estruturas_repeticao;

import java.util.Scanner;

public class percorre_impares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int i;
        for(i = 0; i < num; i++ ){
            if(i % 2 == 1){
                System.out.printf("%d\n",i);
            }
        }
    }
}
