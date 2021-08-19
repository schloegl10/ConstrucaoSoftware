import java.util.Scanner;

public class Pecas {
   
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
