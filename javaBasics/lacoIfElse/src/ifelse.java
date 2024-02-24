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

//        System.out.println("Quantos anos você tem?");
//        int idade = tecla.nextInt();
//
//        if(idade >= 0 && idade < 4){
//            System.out.println("Bebê");
//        } else if(idade >= 4 && idade < 13){
//            System.out.println("Criança.");
//        } else if(idade >= 13 && idade < 18){
//            System.out.println("Adolescente.");
//        } else if(idade >= 18 && idade < 60){
//            System.out.println("Adulto.");
//        } else if(idade > 60){
//            System.out.println("Idoso.");
//        } else {
//            System.out.println("Digite uma idade válida.");
//        }


//        exercício 03 - definir se o numero é positivo, negativo ou neutro

//        System.out.println("Digite um número:");
//        int num = tecla.nextInt();
//
//        if(num < 0){
//            System.out.println(num + " é um número negativo.");
//        } else if(num > 0){
//            System.out.println(num + " é positivo.");
//        } else {
//            System.out.println("zero é neutro.");
//        }


//        exercício 04 - maior de 3 com if/else

        System.out.println("Digite o primeiro número: ");
        int num1 = tecla.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = tecla.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = tecla.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " é maior que " + num2 + " e " + num3);
        } else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " é maior que " + num1 + " e " + num3);
        } else {
            System.out.println(num3 + " é maior que " + num1 + " e " + num2);
        }

    }
}