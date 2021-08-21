import java.util.Scanner;
/**
 * Código feito para calcular valor final de uma compra de 2 tipos de peças sujeitas ao IPI
 * O funcionamento do código tem como base:
 * 1- Receber o valor do IPI
 * 2- Receber os dados da primeira peça (codigo, valor e quantidade)
 * 3- Receber os dados da segunda peça (codigo, valor e quantidade)
 * 4- Calcular o valor que a quantidade de peças 1 e de peças 2 terão acrecidos do IPI
 * 5- Retornar o valor ao terminal
 */

public class Pecas {
   /**
    * O código foi restrito a classe main
    * @param args
    */
    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        double ipi = input.nextDouble();
        String codigoPeca1 = input.next();
        double valorPeca1 = input.nextDouble();
        int quantidadePeca1 = input.nextInt();
        String codigoPeca2 = input.next();
        double valorPeca2 = input.nextDouble();
        int quantidadePeca2 = input.nextInt();
        double valorFinal = (valorPeca1*quantidadePeca1 + valorPeca2*quantidadePeca2)*(ipi/100 + 1);
        System.out.println("valor pago para peca 1 com codigo: " + codigoPeca1 + " e peca 2 com codigo: " + codigoPeca2 + " é: " + valorFinal);
        
        input.close();

    }
}
