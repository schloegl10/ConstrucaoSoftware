import java.util.Scanner;
/**
 * O código tem como unica função retornar qual é o valor anterior a um numero em especifico
 * @author Felipe Silveira Schloegl
 */
public class NumeroAnterior {
   /**
    * O processo pelo qual o programa irá percorrer é, receber um numero inteiro, subtrair 1 dele e retornar o valor ao terminal
    * @param args
    */
    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        int numero = input.nextInt();
        System.out.println(numero - 1);
        
        input.close();

    }
}