import java.util.Scanner;

public class mediaFinal {

    public static void main(String[]args){

        System.out.println("Vamos calular a média do seu ano letivo?");

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println(e);
        }

        Scanner media = new Scanner(System.in);

        System.out.println("Digite a média do 1o bimestre: ");
        float nota1 = media.nextFloat();

        System.out.println("Digite a média do 2o bimestre: ");
        float nota2 = media.nextFloat();

        System.out.println("Digite a média do 3o bimestre: ");
        float nota3 = media.nextFloat();

        System.out.println("Digite a média do 4o bimestre: ");
        float nota4 = media.nextFloat();

        System.out.println("Calculando a média das notas...");

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        float notaFinal = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Sua média final foi: " + notaFinal);

    }

}
