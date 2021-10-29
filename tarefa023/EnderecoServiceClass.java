public class EnderecoServiceClass implements EnderecoService {
    List<CadastroEndereco> cadastroEnderecos;

    public EnderecoServiceClass(List<CadastroEndereco> cadastroEnderecos) {
        this.cadastroEnderecos = cadastroEnderecos;
    }

    List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro) {
        List<Logradouro> logradouros = new List<>();
        Logradouro logradouro;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            logradouro = cadastroEnderecos.get(i).getEndereco().getLogradouro();
            if (logradouro.getTipoLogradouro() == tipoLogradouro) {
                logradouros.add(logradouro);
            }
        }
        return logradouros;
    }

    List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco) {
        List<Endereco> enderecos = new List<>();
        Endereco endereco;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getTipoEndereco() == tipoEndereco) {
                enderecos.add(endereco);
            }
        }
        return enderecos;
    }

    List<Endereco> consultaPorCep(int cep) {
        List<Endereco> enderecos = new List<>();
        Endereco endereco;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getCEP() == cep) {
                enderecos.add(endereco);
            }
        }
        return enderecos;
    }

    List<Endereco> consultaPorLogradouro(Logradouro logradouro) {
        List<Endereco> enderecos = new List<>();
        Endereco endereco;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getLogradouro() == logradouro) {
                enderecos.add(endereco);
            }
        }
        return enderecos;
    }

    List<Endereco> consultaPorBairro(Bairro bairro) {
        List<Endereco> enderecos = new List<>();
        Endereco endereco;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            if (endereco.getLogradouro().getBairro() == bairro) {
                enderecos.add(endereco);
            }
        }
        return enderecos;
    }

    List<Endereco> consultaPorCidade(Cidade cidade) {
        List<Endereco> enderecos = new List<>();
        Endereco endereco;
        Cidade cidadeEndereco;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            cidadeEndereco = endereco.getLogradouro().getBairro().getCidade();
            if (cidadeEndereco == cidade) {
                enderecos.add(endereco);
            }
        }
        return enderecos;
    }

    List<Cidade> listaCidadesPorEstado(Estado estado) {
        List<Cidade> cidades = new List<>();
        Endereco endereco;
        Cidade cidadeEndereco;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            cidadeEndereco = endereco.getLogradouro().getBairro().getCidade();
            if (cidadeEndereco.getEstado() == estado) {
                cidades.add(cidadeEndereco);
            }
        }
        return cidades;
    }

    List<Estado> consultaPorPais(Pais pais) {
        List<Estados> estados = new List<>();
        Endereco endereco;
        Cidade cidadeEndereco;
        Pais estadoEndereco;
        for (int i = 0; i < cadastroEnderecos.size(); i++) {
            endereco = cadastroEnderecos.get(i).getEndereco();
            cidadeEndereco = endereco.getLogradouro().getBairro().getCidade();
            estadoEndereco = cidadeEndereco.getEstado();
            if (estadoEndereco.getPais() == pais) {
                paises.add(estadoEndereco);
            }
        }
        return paises;
    }
}