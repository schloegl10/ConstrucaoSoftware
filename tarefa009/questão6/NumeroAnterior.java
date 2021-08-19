import java.util.Scanner;

public class NumeroAnterior {
   
    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        int numero = input.nextInt();
        System.out.println(numero - 1);
        
        input.close();

    }
}