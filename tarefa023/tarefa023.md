# Tarefa 023 - _Refactoring_ - 22 e 27/10/2021

1. Considere a classe **CadastroEndereco** e a Interface **EnderecoService**, transcritas abaixo:

~~~java
public class CadastroEndereco {
    private String tipoEndereco; //comercial, residencial, etc.
    private String tipoLogradouro; //rua, avenida, alameda, marginal, via, viela, travessa, etc.
    private String nomeLogradouro;
    private int numero;
    private String complementoNumero; //exemplo 13-A, o complemento é -A.
    private String complementoEndereço; //quadra, lote, apartamento, etc.
    private String bairro;
    private Integer CEP;
    private String cidade;
    private String estado;
    private String pais;
}


public interface EnderecoService {
    List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro);
    List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco);
    List<Endereco> consultaPorCep(int cep);
    List<Endereco> consultaPorLogradouro(Logradouro logradouro);
    List<Endereco> consultaPorBairro(Bairro bairro);
    List<Endereco> consultaPorCidade(Cidade cidade);
    List<Cidade> listaCidadesPorEstado(Estado estado);
    List<Estado> consultaPorPais();
}

~~~

2. Refatorar a classe **CadastroEndereco** no seguinte conjunto de classes a seguir, e implementar os métodos necessários para que um cliente de endereço possa obter os dados que precisa a partir de uma consulta à Interface **EnderecoService**.


~~~Java
public class Bairro {
}

public class Cidade {
}

public class Endereco {
}

public class Estado {
}

public class Logradouro {
}

public class Pais {
}

public enum TipoEndereco {
}

public enum TipoLogradouro {
}

~~~~



**INSTRUÇÕES**
1. O uso de orientação a objetos e pré-requisito para esta implementação;
2. A linguagem de programação pode ser a da preferência do aluno;
3. A entrega deve ser feita no seu repositório pessoal no _github_, na _branch_, dentro de uma pasta chamada **tarefa023**.
4. Não devem ser commitados os arquivos de configuração local, arquivos compilados, etc. Estes devem estar adicionados ao arquivo '.gitignore'.
5. A entrega desta tarefa valerá a presença nas aulas assíncronas dos dias 22 e 27/10/2021.
5. O prazo para entrega desta tarefa é as 23h59min do dia 29/10/2021.