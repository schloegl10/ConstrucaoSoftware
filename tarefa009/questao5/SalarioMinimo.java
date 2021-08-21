import java.util.Scanner;
/**
 * O código tem como função calcular com base no valor do salario minimo e no valor de um salario em especifico, quantos salarios minimos são necessários para completar o valor do salario fornecido
 * @author Felipe Silveira Schloegl
 */
public class SalarioMinimo {
    /**
     * O código foi reservado ao metodo main, nele é recebido o valor do salario minimo
     * O valor do salario especifico
     * É divido o salario especifico pelo salario minimo
     * E por fim retornado o valor ao terminal
     * @param args
     */
    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        double salarioMinimo = input.nextDouble();
        double salario = input.nextDouble();
        double numeroSalariosMinimos = salario / salarioMinimo;
        System.out.println(numeroSalariosMinimos);
        
        input.close();

    }
}
