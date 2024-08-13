import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Objects;

public class Carton {
    private ArrayList<Integer> numerosCarton = new ArrayList<>();
    private ArrayList<Integer> numerosMarcados = new ArrayList<>();
    private String nombre;

    public Carton(String nombre) {
        this.nombre = nombre;
        Set<Integer> numerosUnicos = new HashSet<>();
        while (numerosUnicos.size() < 15) {
            int numero = (int) (Math.random() * 100) + 1;
            numerosUnicos.add(numero);
        }
        numerosCarton.addAll(numerosUnicos);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNumerosCarton() {
        return new ArrayList<>(numerosCarton); // Devuelve una copia para evitar modificación externa
    }

    public boolean marcar(int num) {
        if (numerosCarton.contains(num) && !numerosMarcados.contains(num)) {
            numerosMarcados.add(num); // Añade el número marcado al array de números marcados
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getNumerosMarcados() {
        return new ArrayList<>(numerosMarcados);
    }

    public int faltaTerna() {
        int numerosMarcadosCount = numerosMarcados.size();
        return Math.max(3 - numerosMarcadosCount, 0);
    }

    public int faltaQuinta() {
        int numerosMarcadosCount = numerosMarcados.size();
        return Math.max(5 - numerosMarcadosCount, 0);
    }

    public int faltaCartonLleno() {
        int numerosMarcadosCount = numerosMarcados.size();
        return numerosCarton.size() - numerosMarcadosCount;
    }

    public boolean alertaUltimoNumero() {
        return faltaCartonLleno() == 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carton carton = (Carton) obj;
        return Objects.equals(nombre, carton.nombre) && Objects.equals(numerosCarton, carton.numerosCarton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numerosCarton);
    }
}
