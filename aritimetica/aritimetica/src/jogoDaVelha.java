import java.util.Scanner;

public class jogoDaVelha {

    static char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    static Scanner tecla = new Scanner(System.in);

    static boolean verificarVitoria(char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador & tabuleiro[i][1] == jogador & tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador & tabuleiro[1][i] == jogador & tabuleiro[2][i] == jogador)) {
                return true;
            }
        }

        if ((tabuleiro[0][0] == jogador & tabuleiro[1][1] == jogador  & tabuleiro[2][2] == jogador ) ||
                (tabuleiro[0][2] == jogador  & tabuleiro[1][1] == jogador  & tabuleiro[2][0] == jogador )) {
            return true;
        }

        return false;

    }

    static boolean verificarEmpate() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tabuleiro[i][j] ==  ' '){
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        exibirTabuleiro();
        jogar();
    }

    static void exibirTabuleiro() {
        System.out.println(" 0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.println(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.println("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println(" -----");
            }
        }
    }

    static void jogar() {
        char jogadorAtual = 'X';

        while (true) {
            System.out.println("Jogador " + jogadorAtual + ", faça a sua jogada.");
            System.out.println("Digite uma linha (0, 1 ou 2:");
            int linha = tecla.nextInt();
            System.out.println("Digite uma coluna (0, 1 ou 2:");
            int coluna = tecla.nextInt();

            if (linha == 0 && linha < 3 && coluna >= 0 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                exibirTabuleiro();

                if (verificarVitoria(jogadorAtual)) {
                    System.out.println("Parabéns " + jogadorAtual + "! Você venceu.");
                    break;
                }

                if (verificarEmpate()) {
                    System.out.println("O jogo terminou em empate.");
                    break;
                }
                ;

                jogadorAtual = (jogadorAtual == 'X') ? '0' : 'X';


            } else {
                System.out.println("Movimento inválido. Tente novamente.");
            }
        }

    }


//    static boolean verificarVitoria(char jogador) {
//        return false;
//    }
//
//    static boolean verificaEmpate() {
//        return false;
//    }


}