package empresa;

public class FuncionarioBasico extends Funcionario {
    String escolaBasica;
    public FuncionarioBasico(String nome, String codigo, String escolaBasica, Double aumentoSalario, Hierarquia hierarquia) {
        super(nome, codigo, aumentoSalario * 1.1, hierarquia);
        
       
        this.escolaBasica = escolaBasica;
    }
    
}
