package animais;

import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> jaulas = new ArrayList<>();
    public Zoologico() {
        for(int contador = 0; contador < 10; contador++) {
            if(contador%3 == 0) {
                jaulas.add(new Cavalo("Cavalo", contador));
            } else if (contador%3 == 1) {
                jaulas.add(new Cachorro("Cachorro", contador));
            } else {
                jaulas.add(new Preguica("Preguica", contador));
            }
        }
    }

    public void percorreJaulas() {
        for(int contador = 0; contador < 10; contador++) {
            jaulas.get(contador).fazSom();
            if((jaulas.get(contador) instanceof Cavalo)) {
                Cavalo cavalo =  (Cavalo) jaulas.get(contador);
                cavalo.correr();
            } else if((jaulas.get(contador) instanceof Cachorro)) {
                Cachorro cachorro = (Cachorro) jaulas.get(contador);
                cachorro.correr();
            }
        }
    }
}
