import java.util.Scanner;

public class nomeEPeso {

    public static void main(String[]args){
        String nome1 = "";
        float peso1 = 0;
        String nome2 = "";
        float peso2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite no nome 1: ");
        nome1 = teclado.next();

        System.out.println("Digite o peso 1: ");
        peso1 = teclado.nextFloat();

        System.out.println("Digite o nome 2: ");
        nome2 = teclado.next();

        System.out.println("Digite o peso 2: ");
        peso2 = teclado.nextFloat();

        System.out.println("O " + nome1 + ", pesa: " + peso1);
        System.out.println("O " + nome2 + ", pesa: " + peso2);
    }

}
