import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos;
    public Agenda() {
        this.contatos = new ArrayList<>();
    }
    public void addContato(Contato contato) {
        this.contatos.add(contato);
    }
    public void removeContato(Contato contato) {
        this.contatos.remove(contato);
    }
    public Contato buscaContato(String nome) {

            Contato contato = null;
            for (int contador = 0; contador < this.contatos.size(); contador++) {
                if(this.contatos.get(contador).nome.equals(nome)) {
                    contato = this.contatos.get(contador);
                }
            }  
            if(contato == null) {
                throw new ContatoNaoEncontradoException();
            }
            return contato;
        
            

    }
}
