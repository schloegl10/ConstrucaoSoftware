import java.util.Scanner;
public class SalarioMinimo {
    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        double salarioMinimo = input.nextDouble();
        double salario = input.nextDouble();
        double numeroSalariosMinimos = salario / salarioMinimo;
        System.out.println(numeroSalariosMinimos);
        
        input.close();

    }
}
