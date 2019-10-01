package barajapoo;

import java.util.Scanner;

/**
 *
 * @author Alejandro García Serrano 2ºDAM
 */
public class JuegoBaraja {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Creamos la baraja con la que vamos a jugar.
        Baraja baraja = new Baraja();
        int salir = 0;

        System.out.println("Vamos a elegir que baraja prefieres:");
        System.out.println("1.Baraja Española de 48 cartas.");
        System.out.println("2.Baraja Francesa de 52 cartas.");
        System.out.print("Introduzca la opción elegida [1-2]: ");
        int opt = Integer.parseInt(s.nextLine());

        // Menú para el juego.
        do {

            if (opt == 1) {
                System.out.println("\033[31m=========================================");
                System.out.println("\033[33mJuego de la baraja española de 48 cartas.");
                System.out.println("\033[31m=========================================\n");
                baraja.creaBarajaE();
            } else {
                System.out.println("\033[34m============\033[37m===============\033[31m==============");
                System.out.println("\033[34mJuego de la \033[37mbaraja francesa\033[31m de 52 cartas.");
                System.out.println("\033[34m============\033[37m===============\033[31m==============\n");
                baraja.creaBarajaF();
            }
            System.out.println("Menú\n====");
            System.out.println("1.Barajar el mazo de cartas.");
            System.out.println("2.Pedir la siguiente carta del mazo.");
            System.out.println("3.Ver cuantas cartas disponibles para repartir hay.");
            System.out.println("4.Pedir un número de cartas del mazo.");
            System.out.println("5.Saber cuales son las cartas que ya han salido.");
            System.out.println("6.Mostrar las cartas que quedan en el mazo.");
            if (opt == 1) {
                System.out.println("7.Cambiar a baraja francesa");
            } else {
                System.out.println("7.Cambiar a baraja española");
            }
            System.out.println("8.SALIR.");
            System.out.print("Introduzca la opción elegida [1-8]: ");
            int opcion = Integer.parseInt(s.nextLine());
            System.out.println("");

            //Nos movemos entre las opciones.
            switch (opcion) {
                case 1:
                    System.out.println("De acuerdo! Vamos a barajar el mazo de cartas.");
                    baraja.Barajar();
                    System.out.println("Barajado!! Volviendo al menú....\n");
                    break;
                case 2:
                    baraja.siguienteCarta();
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Cuantas cartas desea? ");
                    int num = Integer.parseInt(s.nextLine());
                    baraja.darCartas(num);
                    System.out.println("");
                    break;
                case 5:
                    baraja.cartasMonton();
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Las cartas que quedan en el mazo son:");
                    baraja.mostrarBaraja();
                    System.out.println("");
                    break;
                case 7:
                    if (opt == 1) {
                        opt = 2;
                    } else {
                        opt = 1;
                    }
                    break;
                case 8:
                    System.out.println("Gracias por jugar!!");
                    salir = 1;
            }
        } while (salir == 0);

    }

}
