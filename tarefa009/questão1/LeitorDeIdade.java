import java.util.Scanner;
public class LeitorDeIdade {

    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        String texto = input.nextLine();
        String[] dados = texto.split(" ");
        Integer idadeDias = Integer.parseInt(dados[0]) * 365 + Integer.parseInt(dados[2]) * 30 + Integer.parseInt(dados[5]);
        String idadeDiasString = idadeDias.toString();
        System.out.println(idadeDiasString);
        input.close();
    }
}