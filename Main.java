import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bolillero bolillero = new Bolillero();
        Planilla planilla = new Planilla();
        Cartones cartones = new Cartones();

        // Crear y agregar cartones
        Carton carton1 = new Carton("Roman Bellick");
        Carton carton2 = new Carton("Niko Bellick");
        cartones.agregarCarton(carton1);
        cartones.agregarCarton(carton2);

        // Simulación del juego
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                       Bolillas salidas:                         |");
        System.out.println("-------------------------------------------------------------------");

        List<Integer> bolillasSalidas = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int bolilla = bolillero.getBolilla();
            planilla.setSalido(bolilla);
            cartones.marcarCartones(bolilla);
            bolillasSalidas.add(bolilla);
        }
        
        System.out.println("");
        System.out.println("  "+bolillasSalidas);
        System.out.println("");

        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                       Cartones Jugados:                         |");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("");

        // Verificar y mostrar resultados para Carton 1
        System.out.println("* CARTON N°1 (de " + carton1.getNombre() + "): ");
        System.out.println("  "+carton1.getNumeros());
        System.out.println("");
        System.out.println("   - Faltan " + carton1.faltaCartonLleno() + " números para llenar el carton.");

        if (carton1.faltaTerna() <= 0) {
            System.out.println("   - ¡Terna conseguida!");
        } else {
            System.out.println("   - Faltan " + carton1.faltaTerna() + " números para la terna.");
        }
        if (carton1.faltaQuinta() <= 0) {
            System.out.println("   - ¡Quinta conseguida!");
        } else {
            System.out.println("   - Faltan " + carton1.faltaQuinta() + " números para la quinta.");
        }

        // Verificar y mostrar resultados para Carton 2
        System.out.println("");
        System.out.println("* CARTON N°2 (de " + carton2.getNombre() + "): ");
        System.out.println("  "+carton2.getNumeros());
        System.out.println("");
        System.out.println("   - Faltan " + carton2.faltaCartonLleno() + " números para llenar el carton.");
        
        if (carton2.faltaTerna() <= 0) {
            System.out.println("   - ¡Terna conseguida!");
        } else {
            System.out.println("   - Faltan " + carton2.faltaTerna() + " números para la terna.");
        }
        if (carton2.faltaQuinta() <= 0) {
            System.out.println("   - ¡Quinta conseguida!");
        } else {
            System.out.println("   - Faltan " + carton2.faltaQuinta() + " números para la quinta.");
        }

        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("|                           Fin del Juego                         |");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
    }


}
