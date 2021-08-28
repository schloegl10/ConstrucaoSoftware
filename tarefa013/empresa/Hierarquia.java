package empresa;

public enum Hierarquia {
    GERENTE(1500.0),
    SUPERVISOR(600.00),
    VENDEDOR(250.0);

    protected double valor;
    Hierarquia(double valor) {
        this.valor = valor;
    }
}
