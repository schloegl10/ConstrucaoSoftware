public class Logradouro {
    private TipoLogradouro tipoLogradouro;
    private String nome;
    private Bairro bairro;

    public Logradouro(TipoLogradouro tipoLogradouro, String nome, Bairro bairro) {
        this.tipoLogradouro = tipoLogradouro;
        this.nome = nome;
        this.bairro = bairro;
    }

    public TipoLogradouro getTipoLogradouro() {
        return this.tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bairro getBairro() {
        return this.bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
}