import java.util.Scanner;
public class RetornaSaldo {

    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        double saldo = input.nextDouble();
        saldo = saldo * 1.15;
        System.out.println(saldo);
        input.close();
    }
}
