public class lacofor {

    public static void main(String[] args) {

//        int[] numeros = {11, 22, 33, 44, 55};
//
//        for(int i = 0; i < 5; i++){
//            System.out.println(numeros[i]);
//        }

//        for(int i = 5; i > 0; i--){
//            System.out.println(i);
//        }

//        int soma = 0;
//
//        for(int i = 0; i < 100; i++){
//            soma += i;
//        }
//
//        System.out.println(soma);

//        for(int i = 0; i <= 20; i +=2){
//            System.out.println(i);
//        }

//        int num = 0;
//
//        for (int i = 0; i <= 10; i++) {
//            num = i * 5;
//            System.out.println(i + " x 5 = " + num);
//        }


//        exercício 01 - 5 primeiros números primos

        int[] numPri = new int[5];
        int count = 0;

        for (int i = 2; count < 5; i++) {
            if (isPrimo(i)) {
                numPri[count] = i;
                count++;
            }
        }

        System.out.println("Os 5 primeiros números primos são: ");
        for (int primo : numPri) {
            System.out.println(primo);
        }

    }

    private static boolean isPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
