package animais;

public class Animal {
    String nome;
    int idade;
    String som;
    public Animal (String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }
    public void fazSom() {
        System.out.println(som);
    }

}
