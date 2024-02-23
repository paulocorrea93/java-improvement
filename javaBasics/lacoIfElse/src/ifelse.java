import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

//        exercício 01 - impar ou par

//        System.out.println("Digite um número: ");
//        int parOuImpar = tecla.nextInt();
//
//        if(parOuImpar % 2 == 0){
//            System.out.println(parOuImpar + " é par.");
//        } else {
//            System.out.println(parOuImpar + " é ímpar.");
//        }

//        exercício 02 - determinar faixa etária por idade

        System.out.println("Quantos anos você tem?");
        int idade = tecla.nextInt();

        if(idade >= 0 && idade < 4){
            System.out.println("Bebê");
        } else if(idade >= 4 && idade < 13){
            System.out.println("Criança.");
        } else if(idade >= 13 && idade < 18){
            System.out.println("Adolescente.");
        } else if(idade >= 18 && idade < 60){
            System.out.println("Adulto.");
        } else if(idade > 60){
            System.out.println("Idoso.");
        } else {
            System.out.println("Digite uma idade válida.");
        }

    }
}