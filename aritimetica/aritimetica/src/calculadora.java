import java.util.Scanner;

public class calculadora {

    public static void main(String[]args){

        Scanner tecla = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = tecla.nextFloat();

        System.out.println("Digite o segundo número: ");
        double num2 = tecla.nextFloat();

        System.out.println("Escolha uma operação: ");
        char operacao = tecla.next().charAt(0);

        if(operacao == '+'){
            double resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resultado);
        } else if(operacao == '-'){
            double resultado = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + resultado);
        } else if(operacao == 'x'){
            double resultado = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + resultado);
        } else {
            double resultado = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + resultado);
        }

    }

}
