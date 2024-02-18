import java.util.Scanner;

public class estruturaDeFluxo2 {

    public static void main(String[]args){
        System.out.println("Digite uma vogal");
        Scanner teclado = new Scanner(System.in);
        char letra = teclado.next().charAt(0);

        switch (letra){
            case'A': System.out.println("Vogal A");
            break;
            case'E': System.out.println("Vogal E");
            break;
            case'I': System.out.println("Vogal I");
            break;
            case'O': System.out.println("Vogal O");
            break;
            case'U': System.out.println("Vogal U");
            break;
            default: System.out.println("Não é uma vogal");
        }

    }

}
