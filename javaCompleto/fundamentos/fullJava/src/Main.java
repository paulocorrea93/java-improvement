import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

//        Dada uma variável idade, crie uma estrutura de controle de fluxo que imprima "Maior de idade" se a idade for
//        igual ou superior a 18, e "Menor de idade" caso contrário.
//
//        System.out.println("Informe a sua idade:");
//        int idade = tecla.nextInt();
//
//        if (idade >= 18) {
//            System.out.println("Maior de idade.");
//        } else {
//            System.out.println("Menor de idade.");
//        }

//        Escreva um programa que avalie duas variáveis inteiras, a e b.Se a for maior que b, imprima "A é maior".Se b
//        for maior que a, imprima "B é maior". Se ambos forem iguais, imprima "A e B são iguais".


//        System.out.println("Digite um número: ");
//        int a = tecla.nextInt();
//
//        System.out.println("Digite outro número: ");
//        int b = tecla.nextInt();
//
//        if(a > b){
//            System.out.println(a + " é maior que " + b);
//            System.out.println("a é maior que b");
//        } else if (b > a){
//            System.out.println(b + " é maior que " + a);
//            System.out.println("b é maior que a");
//        } else {
//            System.out.println(a + " e " + b + " são iguais");
//            System.out.println("a e b são iguais");
//        }


//        Implemente um programa que use a estrutura switch para lidar com o dia da semana. Dada uma variável dia
//        contendo um valor de 1 a 7 (onde 1 é domingo e 7 é sábado), imprima o nome do dia correspondente.


//        System.out.println("Digite o número do dia da semana:");
//        int dia = tecla.nextInt();
//
//        switch (dia){
//            case 1 : System.out.println("Doming");
//            break;
//            case 2 : System.out.println("Segunda");
//            break;
//            case 3 : System.out.println("Terça");
//            break;
//            case 4 : System.out.println("Quarta");
//            break;
//            case 5 : System.out.println("Quinta");
//            break;
//            case 6 : System.out.println("Sexta");
//            break;
//            case 7 : System.out.println("Sábado");
//            break;
//            default : System.out.println("Digite um núemro de 1 a 7");
//        }

//        Crie um programa que avalie três números, x, y, e z. Utilize a estrutura de controle de fluxo para determinar
//        qual é o maior dos três números.

        System.out.println("Digite o primeiro numero:");
        int num1 = tecla.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = tecla.nextInt();

        System.out.println("Digite o terceiro número");
        int num3 = tecla.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " é o maior que " + num2 + " e " + num3);
        } else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " é o maior que " + num1 + " e " + num3);
        } else {
            System.out.println(num3 + " é o maior que " + num1 + " e " + num2);
        }


    }
}