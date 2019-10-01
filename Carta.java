/**
 *
 * @author Alejandro García Serrano 2ºDAM
 */
public class Carta{
    
    private String valor;
    private String palo;
    
    
    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }
    
    void mostrarCarta(){
        System.out.print(valor + " de " + palo);
    }

    @Override
    public String toString() {
        return "" + valor + " de " + palo;
    }
   
}


