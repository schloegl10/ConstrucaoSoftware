package animais;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade, "som de cavalo");
    }

    public void correr() {
        System.out.println("caminhando");
    }
    
}
