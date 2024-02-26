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

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        //        Escreva um programa que avalie duas variáveis inteiras, a e b. Se a for maior que b,
//        imprima "A é maior". Se b for maior que a, imprima "B é maior". Se ambos forem iguais,
//        imprima "A e B são iguais".


        System.out.println("Digite um número: ");
        int a = tecla.nextInt();

        System.out.println("Digite outro número: ");
        int b = tecla.nextInt();

        if(a > b){
            System.out.println(a + " é maior que " + b);
            System.out.println("a é maior que b");
        } else if (b > a){
            System.out.println(b + " é maior que " + a);
            System.out.println("b é maior que a");
        } else {
            System.out.println(a + " e " + b + " são iguais");
            System.out.println("a e b são iguais");
        }

    }
}