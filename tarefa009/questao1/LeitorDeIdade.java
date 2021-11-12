import java.util.Scanner;
/** O seguinte programa é responsavel por receber uma idade no formato:
 *  X anos, Y meses e Z dias
 *  ele então irá calcular a idade em dias, considerando ano como tendo 365 dias e um mes com 30 dias
 */
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