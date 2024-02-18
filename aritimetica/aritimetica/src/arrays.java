import java.util.Scanner;

public class arrays {

    public static void main(String[]args){

        int[] numeros = new int[3];
        numeros[0] = 12;
        numeros[1] = 23;
        numeros[2] = 30;

        String[] nomes = new String[3];
        nomes[0] = "Paulo";
        nomes[1] = "Gabriel";
        nomes[2] = "Correa";

        System.out.println(nomes[0] + ", " + numeros[2]);

        int[] numArr = new int[10];
        System.out.println("Digite 10 números");
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            numArr[i] = teclado.nextInt();

        }

        for(int i = 0; i <10 ; i++){
            System.out.println(numArr[i]);
        }

    }

}
