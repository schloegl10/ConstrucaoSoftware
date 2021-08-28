package empresa;

public class FuncionarioGraduado extends FuncionarioMedio {
    String universidade;
    public FuncionarioGraduado(String nome, String codigo, String escolaBasica, String escolaMedio, String universidade, Hierarquia hierarquia) {
        super(nome, codigo, escolaBasica, escolaMedio, 2.0, hierarquia);
        this.universidade = universidade;
    }
    
}
