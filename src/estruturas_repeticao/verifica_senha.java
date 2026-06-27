package estruturas_repeticao;

import java.util.Scanner;

public class verifica_senha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("USUARIO: VITOR");
        System.out.print("Digite a senha para entrar:");
        int entradaSenha = input.nextInt();
        int sennhaCorreta = 2003;

        while (entradaSenha != sennhaCorreta){
            System.out.println("Senha incorreta");
            System.out.print("Digite a senha novamente:");
            entradaSenha = input.nextInt();

            if (entradaSenha == sennhaCorreta){
                System.out.println("Acesso permitido: Bem-Vindo Vitor !");
                break;
            }
        }

    }
}
