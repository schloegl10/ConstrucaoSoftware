package empresa;

public class Funcionario {
    String nome;
    String codigo;
    Double salario;
    Hierarquia hierarquia;
    public Funcionario(String nome, String codigo, Double aumentoSalario, Hierarquia hierarquia) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = 1000.0;
        this.hierarquia = hierarquia;
        if(aumentoSalario != null) {
            this.salario = this.salario * aumentoSalario;
        }
        this.salario = salario + hierarquia.valor;
    }

    public String toString() {
        return "nome=" + nome + " comicao=" + hierarquia.valor + " salario=" + salario;
    }
}
