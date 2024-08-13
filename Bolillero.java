import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Bolillero {
    private Set<Integer> bolillasSalidas = new HashSet<>();
    private Random random = new Random();

    public int getBolilla() {
        int bolilla;
        do {
            bolilla = random.nextInt(100) + 1; // Genera una bolilla entre 1 y 100
        } while (bolillasSalidas.contains(bolilla)); // Repetir hasta obtener una bolilla no sorteada
        bolillasSalidas.add(bolilla);
        return bolilla;
    }

    public ArrayList<Integer> getBolillasSalidas() {
        return new ArrayList<>(bolillasSalidas); // Devuelve una copia de las bolillas salidas
    }
}

