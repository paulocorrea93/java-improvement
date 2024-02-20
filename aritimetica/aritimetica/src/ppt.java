import java.util.Scanner;

public class ppt {

    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha um: Pedra (1), Papel(2), Tesoura(3)");
        int jogada1 = teclado.nextInt();

        if(jogada1 == 1){
            System.out.println("usuário escolheu Pedra");
        } else if (jogada1 == 2){
            System.out.println("usuário escolheu Papel");
        } else {
            System.out.println("usuário escolheu Tesoura");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Agora é a vez do CPU jogar...");
        int jogada2 = (int)(Math.random() * 3) + 1;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(jogada2 == 1){
            System.out.println("CPU escolheu Pedra");
        } else if(jogada2 == 2){
            System.out.println("CPU escolheu Papel");
        } else {
            System.out.println("CPU escolheu Tesoura");
        }

        System.out.println("Processando o vencedor");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(jogada1 == jogada2){
            System.out.println("Empatou");
        } else if(jogada1 == 1 && jogada2 == 3){
            System.out.println("Pedra quebra tesoura, você ganhou.");
        } else if(jogada1 == 2 && jogada2 == 1){
            System.out.println("Papel cobre pedra, você ganhou.");
        } else if(jogada1 == 3 && jogada2 == 2){
            System.out.println("Tesoura corta papel, você ganhou");
        } else {
            System.out.println("Você perdeu.");
        }

    }

}
