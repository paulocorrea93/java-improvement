import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

//        Dada uma variável idade, crie uma estrutura de controle de fluxo
//        que imprima "Maior de idade" se a idade for igual ou superior a 18,
//        e "Menor de idade" caso contrário.
//
        System.out.println("Informe a sua idade:");
        int idade = tecla.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

    }
}