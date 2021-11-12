import java.util.Arrays;
import java.util.Scanner;

public class Divisao {

    private static Scanner sc = new Scanner(System.in);

    public static int divide(int dividendo, int divisor){
        if(divisor == 0) {
            throw new ArithmeticException("Divisão por 0");
        }
        return dividendo/divisor;
    }

    public static void main (String args[]) {

        System.out.println("Informe o valor do dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Informe o valor do divisor: ");
        int divisor = sc.nextInt();
        try {
            System.out.println(divide(dividendo, divisor));
        } catch (Exception e) {
            System.out.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        }
    }

}