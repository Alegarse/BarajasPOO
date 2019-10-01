import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alejandro García Serrano 2ºDAM
 *
 */
public class Baraja {

    String[] pE = {"oros", "copas", "bastos", "espadas"};
    String[] vE = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "Sota", "Caballo", "Rey"};
    String[] pF = {"picas", "treboles", "diamantes", "corazones"};
    String[] vF = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Sota", "Caballo", "Rey"};

    ArrayList<Carta> mazo = new ArrayList<Carta>();
    ArrayList<Carta> monton = new ArrayList<Carta>();

    // Métodos
    // Desc: Crea la baraja española sobre la que vamos a trabajar
    void creaBarajaE() {
        mazo.clear();
        monton.clear();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                mazo.add(new Carta(vE[j], pE[i]));
            }
        }
    }

    void creaBarajaF() {
        mazo.clear();
        monton.clear();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                mazo.add(new Carta(vF[j], pF[i]));
            }
        }
    }

    //Desc: Muestra la baraja original por pantalla
    void mostrarBaraja() {
        for (Carta cartaAux : mazo) {
            System.out.print(cartaAux + "\n");
        }
    }

    //Desc: Cambia de manera aleatoria las cartas de la baraja.
    void Barajar() {
        Collections.shuffle(mazo);
    }

    //Desc: Devuelve la siguiente carta que se encuentra en la parte superior
    //      de la baraja. Cuando no hay más se le indica a usuario.
    void siguienteCarta() {
        if (mazo.size() == 0) {
            System.out.println("No hay más cartas para repartir en la baraja.");
        } else {
            System.out.println("La siguiente carta es: " + mazo.get(0));
            monton.add(mazo.get(0));
            mazo.remove(0);
        }
        System.out.println("");
    }

    //Desc: Indica el número de cartas que aún se pueden repartir.
    void cartasDisponibles() {
        System.out.println("El número de cartas que se pueden aún repartir es de " + mazo.size() + "\n");
    }

    //Desc: Devolvemos el número de cartas solicitadas, siempre que sea posible.
    //      En caso de que haya menos cartas de las pedidas, no se devuelve nada
    //      pero se le indica al usuario.
    void darCartas(int num) {
        if (num > mazo.size()) {
            System.out.println("No hay tantas cartas que se puedan repartir.");
        } else {
            for (int n = 0; n < num; n++) {
                System.out.println(mazo.get(0));
                monton.add(mazo.get(0));
                mazo.remove(0);
            }
        }
    }

    //Desc: Mostramos aquellas cartas que ya han salido; sino ha salido ninguna,
    //      lo indicamos.
    void cartasMonton() {
        System.out.println("Las cartas que ya han salido son:");
        if (monton.size() == 0) {
            System.out.print("Aún no ha salido ninguna carta.");
        } else {
            for (Carta yaMostradas : monton) {
                System.out.print(yaMostradas + "\n");
            }
        }
    }
}
