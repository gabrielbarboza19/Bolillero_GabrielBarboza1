import java.util.ArrayList;

public class Planilla {
    private ArrayList<Integer> salido = new ArrayList<>();

    public void setSalido(int num) {
        salido.add(num);
    }
    public boolean verificarNumeros(int... numeros) {
        for (int num : numeros) {
            if (!salido.contains(num)) {
                return false;
            }
        }
        return true;
    }

    public boolean verificarTerna(int n1, int n2, int n3) {
        return salido.contains(n1) && salido.contains(n2) && salido.contains(n3);
    }

    public boolean verificarQuinta(int n1, int n2, int n3, int n4, int n5) {
        return salido.contains(n1) && salido.contains(n2) && salido.contains(n3) && salido.contains(n4) && salido.contains(n5);
    }

    public boolean verificarCartonLleno(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        return salido.contains(n1) && salido.contains(n2) && salido.contains(n3) &&
               salido.contains(n4) && salido.contains(n5) && salido.contains(n6) &&
               salido.contains(n7) && salido.contains(n8) && salido.contains(n9) &&
               salido.contains(n10) && salido.contains(n11) && salido.contains(n12) &&
               salido.contains(n13) && salido.contains(n14) && salido.contains(n15);
    }

    public boolean verificarSalido(int num) {
        return salido.contains(num);
    }

    public boolean borrarSalido(int num) {
        return salido.remove((Integer) num);
    }
}
