package animais;



import java.util.ArrayList;

public class AnimalTeste {
    public static void main(String args[]) {
        Animal cachorro = new Cachorro("tody", 1);
        Animal cavalo = new Cavalo("cavalo", 2);
        Animal preguica = new Preguica("preguica", 10);
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);
        for(int contador = 0; contador < 3; contador++ ) {
            animais.get(contador).fazSom();
        }
        Veterinario veterinario = new Veterinario();
        for(int contador = 0; contador < 3; contador++ ) {
            veterinario.examinar(animais.get(contador));
        }

        Zoologico zoologico = new Zoologico();
        zoologico.percorreJaulas();
    }
}
