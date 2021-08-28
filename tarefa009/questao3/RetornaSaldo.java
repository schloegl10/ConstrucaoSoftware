import java.util.Scanner;
/**
 * O código foi criado com o propósito de receber o valor de um saldo e arbitrariamente incrementa-lo em 15%, retornando assim esse valor 1,15 vezes maior
 * @author Felipe Silveira Schloegl
 */
public class RetornaSaldo {
    /**
     * O metodo main fica como responsavel pelo recebimento do valor, seu acrescimo e por fim o retorno do valor ao terminal
     * @param args
     */
    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        double saldo = input.nextDouble();
        saldo = saldo * 1.15;
        System.out.println(saldo);
        input.close();
    }
}
