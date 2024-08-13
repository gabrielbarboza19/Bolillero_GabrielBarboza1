import java.util.ArrayList;

public class Cartones {
    private ArrayList<Carton> cartones = new ArrayList<>();

    public void agregarCarton(Carton carton) {
        cartones.add(carton);
    }

    public void marcarCartones(int num) {
        for (Carton carton : cartones) {
            carton.marcar(num);
        }
    }
}
