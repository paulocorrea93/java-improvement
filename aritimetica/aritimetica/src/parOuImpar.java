import java.util.Scanner;

public class parOuImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 0 para escolher par ou 1 para escolher ímpar:");
        int escolha = teclado.nextInt();

        if (escolha == 0) {
            System.out.println("Usuário escolheu par");
        } else {
            System.out.println("O usuário escolheu ímpar");
        }

        System.out.println("Faça a sua jogada. 2 ou 1?");
        int jogada = teclado.nextInt();
        System.out.println("Agora é a vez do CPU jogar");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double numero = Math.random();
        int jogada2 = (int) Math.ceil(numero);

        System.out.println("O CPU jogou: " + jogada2);

        System.out.println("Calculando o vencedor...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int soma = jogada + jogada2;

        boolean resultadoPar = soma % 2 == 0;

        if (resultadoPar == true && escolha == 0) {
            System.out.println("O usuário ganhou!");
        } else if (resultadoPar == false && escolha == 1) {
            System.out.println("O usuário ganhou!");
        } else {
            System.out.println("O CPU ganhou!");
        }
    }
}
