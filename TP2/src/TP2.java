import java.util.Scanner;


public class TP2 {

    static Scanner teclado = new Scanner(System.in);


    static String[][] nombres = new String[10][10];
    static String[][] telefonos = new String[10][10];

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== CINE =====");
            System.out.println("1. Ver mapa de asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Eliminar reserva");
            System.out.println("4. Consultar reserva");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    mostrarMapa();
                    break;

                case 2:
                    reservarAsiento();
                    break;

                case 3:
                    eliminarReserva();
                    break;

                case 4:
                    consultarReserva();
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 5);
    }


    public static void mostrarMapa() {

        System.out.println("\n==== MAPA DE ASIENTOS ====");
        System.out.println("O = Disponible");
        System.out.println("X = Reservado\n");

        System.out.print("       ");

        for (int asiento = 1; asiento <= 10; asiento++) {
            System.out.printf("%3d", asiento);
        }

        System.out.println();

        for (int fila = 0; fila < 10; fila++) {

            System.out.printf("Fila %2d", fila + 1);

            for (int asiento = 0; asiento < 10; asiento++) {

                if (nombres[fila][asiento] == null) {
                    System.out.printf("%3s", "O");
                } else {
                    System.out.printf("%3s", "X");
                }
            }

            System.out.println();
        }
    }


    public static void reservarAsiento() {

        mostrarMapa();

        System.out.print("\nIngrese la fila (1-10): ");
        int fila = teclado.nextInt();

        System.out.print("Ingrese el asiento (1-10): ");
        int asiento = teclado.nextInt();


        if (fila < 1 || fila > 10 || asiento < 1 || asiento > 10) {
            System.out.println("La fila o el asiento no son válidos.");
            return;
        }


        int f = fila - 1;
        int a = asiento - 1;


        if (nombres[f][a] != null) {

            System.out.println("\n El asiento ya está reservado.");
            System.out.println("Cliente: " + nombres[f][a]);
            System.out.println("Teléfono: " + telefonos[f][a]);

            return;
        }


        teclado.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el teléfono: ");
        String telefono = teclado.nextLine();


        nombres[f][a] = nombre;
        telefonos[f][a] = telefono;

        System.out.println("\n Reserva realizada correctamente.");
        System.out.println("Cliente: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fila: " + fila);
        System.out.println("Asiento: " + asiento);
    }

    public static void eliminarReserva() {

        mostrarMapa();

        System.out.print("\nIngrese la fila de la reserva: ");
        int fila = teclado.nextInt();

        System.out.print("Ingrese el asiento de la reserva: ");
        int asiento = teclado.nextInt();


        if (fila < 1 || fila > 10 || asiento < 1 || asiento > 10) {
            System.out.println("La fila o el asiento no son válidos.");
            return;
        }

        int f = fila - 1;
        int a = asiento - 1;

        if (nombres[f][a] == null) {

            System.out.println("Ese asiento está disponible.");
            return;
        }

        System.out.println("\nReserva encontrada:");
        System.out.println("Cliente: " + nombres[f][a]);
        System.out.println("Teléfono: " + telefonos[f][a]);

        System.out.print("¿Desea eliminar esta reserva? (1 = Sí / 2 = No): ");
        int confirmar = teclado.nextInt();

        if (confirmar == 1) {

            nombres[f][a] = null;
            telefonos[f][a] = null;

            System.out.println("✓ Reserva eliminada correctamente.");
            System.out.println("El asiento vuelve a estar disponible.");

        } else {

            System.out.println("La reserva no fue eliminada.");
        }
    }



    public static void consultarReserva() {

        System.out.print("\nIngrese la fila: ");
        int fila = teclado.nextInt();

        System.out.print("Ingrese el asiento: ");
        int asiento = teclado.nextInt();

        if (fila < 1 || fila > 10 || asiento < 1 || asiento > 10) {
            System.out.println("La fila o el asiento no son válidos.");
            return;
        }

        int f = fila - 1;
        int a = asiento - 1;

        if (nombres[f][a] == null) {

            System.out.println("\n✓ El asiento está disponible.");

        } else {

            System.out.println("\n========== RESERVA ==========");
            System.out.println("Fila: " + fila);
            System.out.println("Asiento: " + asiento);
            System.out.println("Cliente: " + nombres[f][a]);
            System.out.println("Teléfono: " + telefonos[f][a]);
        }
    }
}