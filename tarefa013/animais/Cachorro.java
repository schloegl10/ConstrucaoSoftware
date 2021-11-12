package animais;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade, "latido");
    }

    public void correr() {
        System.out.println("caminhando");
    }
}
