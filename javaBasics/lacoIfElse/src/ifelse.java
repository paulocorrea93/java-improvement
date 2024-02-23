import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

//        exercício 01 - impar ou par

        System.out.println("Digite um número: ");
        int parOuImpar = tecla.nextInt();

        if(parOuImpar % 2 == 0){
            System.out.println(parOuImpar + " é par.");
        } else {
            System.out.println(parOuImpar + " é ímpar.");
        }



    }
}