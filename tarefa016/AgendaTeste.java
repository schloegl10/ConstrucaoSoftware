import java.util.Arrays;

public class AgendaTeste {
    public static void main(String args[]) {
        Agenda agenda = new Agenda();
        Contato contato1 = new Contato("AA", 123, "aa@aa.aa");
        agenda.addContato(contato1);
        Contato contato2 = new Contato("BB", 321, "bb@bb.bb");
        agenda.addContato(contato2);
        Contato contato3 = new Contato("CC", 231, "cc@cc.cc");
        agenda.addContato(contato3);
        try {
            agenda.buscaContato("ERRADO");
        } catch(Exception e) {
            System.out.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        } finally {
            agenda.removeContato(contato1);
            agenda.removeContato(contato2);
            agenda.removeContato(contato3);
        }
    }
}

