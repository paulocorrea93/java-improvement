public class estruturasDeFluxo {

    public static void main(String[]args){
        int x = 0;

        if(x == 0){
            System.out.println("x é igual a zero");
        };

        int y = 5;

        if(y % 2 == 0){
            System.out.println(y + " é par");
        } else {
            System.out.println(y + " é impar");
        };

        for(int z = 0; z <= 10; z++){
            if(z % 2 == 0){
                System.out.println(z + " é par");
            } else {
                System.out.println(z + " é ímpar");
            }
        };

    }

}
