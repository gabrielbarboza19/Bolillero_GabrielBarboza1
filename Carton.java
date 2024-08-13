import java.util.Set; // Añadir esta importación
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Objects;

public class Carton {
    private Set<Integer> numerosCarton = new HashSet<>();
    private String nombre;

    public Carton(String nombre) {
        this.nombre = nombre;
        for (int i = 0; i < 15; i++) {
            int numero;
            do {
                numero = (int) (Math.random() * 100) + 1;
            } while (numerosCarton.contains(numero));
            numerosCarton.add(numero);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNumeros() {
        return new ArrayList<>(numerosCarton); // Devuelve una copia para evitar modificación externa
    }

    public boolean marcar(int num) {
        if (numerosCarton.contains(num)) {
            numerosCarton.remove(Integer.valueOf(num)); // Elimina el número
            return true;
        }
        return false;
    }

    public int faltaTerna() {
        return Math.max(3 - (15 - numerosCarton.size()), 0); // Recalcular cuántos faltan para Terna
    }

    public int faltaQuinta() {
        return Math.max(5 - (15 - numerosCarton.size()), 0); // Recalcular cuántos faltan para Quinta
    }

    public int faltaCartonLleno() {
        return numerosCarton.size(); // Cuántos números faltan para el cartón lleno
    }

    public boolean alertaUltimoNumero() {
        return numerosCarton.size() == 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carton carton = (Carton) obj;
        return Objects.equals(nombre, carton.nombre) && Objects.equals(numerosCarton, carton.numerosCarton);
    }
}
