package estrutura_condicional;

import java.util.Scanner;

public class duracao_jogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tempo Total Jogo");
        System.out.print("Tempo inicio do Jogo:");
        int tempoInicio = input.nextInt();
        System.out.print("Tempo fim do Jogo:");
        int tempoFim = input.nextInt();

        int duracaoMaxima = 24;
        int calculoTempo;

        if(tempoInicio < tempoFim){
            calculoTempo = tempoFim - tempoInicio;
        }else{
            calculoTempo = duracaoMaxima -tempoInicio + tempoFim;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)",calculoTempo);
    }
}
