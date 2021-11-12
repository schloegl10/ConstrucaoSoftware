package empresa;

public class FuncionarioMedio extends FuncionarioBasico {
    String escolaMedio;
    public FuncionarioMedio(String nome, String codigo, String escolaBasica, String escolaMedio, Double aumentoSalario, Hierarquia hierarquia) {
        super(nome, codigo, escolaBasica, aumentoSalario * 1.5, hierarquia);
        this.escolaMedio = escolaMedio;
    }
    
}
