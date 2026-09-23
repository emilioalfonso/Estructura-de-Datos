package ejercicio8;
import java.util.Scanner;
public class EJERCICIO8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
/*Un cine desea desarrollar un sistema de reserva de asientos para su sala, que consta de 10 filas con 10 asientos cada una, sumando un total de 100 asientos. El sistema debe mostrar un mapa o plano interactivo de la sala, indicando cuáles asientos están reservados y cuáles están disponibles.
Requisitos:
Reserva de Asientos:
El sistema debe solicitar el nombre y el teléfono del cliente al momento de realizar una reserva.
El cliente podrá seleccionar el asiento que desea reservar, ingresando su ubicación.
Si el asiento ya está reservado, el sistema debe mostrar un aviso indicando quién tiene la reserva para ese asiento.
Eliminar Reserva:
El sistema debe contar con una opción que permita eliminar una reserva previamente realizada, liberando el asiento para nuevas reservas.*/        

        //Declaracion de variables
        String nombres [][] = new String [10][10];
        String telefonos [][] = new String [10][10];
        int opcion = 0;
        int filaselec = 0;
        int columnaselec = 0;
        String confirmacion;
        
        //Crear estructuras para los 100 asientos
        for (int f = 0; f < 10; f++){
            for (int c = 0; c < 10; c++){
            nombres[f][c] = "Libre";
            telefonos[f][c] = "-";
            }
        }
        
        //opciones
        while (opcion != 4) {
            System.out.println("MENU DE RESERVAS DE CINE");
            System.out.println("1. Mostrar mapa de la sala");
            System.out.println("2. Realizar una Reserva");
            System.out.println("3. Eliminar una Reserva");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                //mostrar  mapa de la sala
                case 1 -> { 
                    for (int f = 0; f < 10; f++){ 
                        System.out.println(" ");
                        for (int c = 0; c < 10; c++){
                            if (nombres[f][c].equals("Libre")) {
                            System.out.print("[L] ");} else {
                            System.out.print("[X] ");
                            }
                        }
                    }
                    System.out.println(" ");
                    System.out.println(" ");
                }
                
                case 2 -> {
                    //realizar una reserva
                    System.out.println("Escriba la fila la cual quiera reservar: ");
                    filaselec = teclado.nextInt();
                    System.out.println("Escriba la columna la cual quiera reservar: ");
                    columnaselec = teclado.nextInt();
                    teclado.nextLine();
                    if (filaselec >= 1 && filaselec <= 10 && columnaselec >= 1 && columnaselec <= 10) {
                        if (nombres [filaselec-1][columnaselec-1].equals("Libre")) {
                            System.out.println("Escriba su nombre: ");
                            nombres [filaselec-1][columnaselec-1] = teclado.nextLine();
                            System.out.println("Escriba su telefono: ");
                            telefonos [filaselec-1][columnaselec-1] = teclado.nextLine();
                            System.out.println("Reserva realizada correctamente.");
                            System.out.println(" ");
                        } 
                        else {
                            System.out.println("Este asiento esta reservado por: ");
                            System.out.println(nombres [filaselec-1] [columnaselec-1]+" ");
                            System.out.println(telefonos [filaselec-1] [columnaselec-1]);
                        }      
                    } 
                    else {
                            System.out.println("Fila o columna inválida. Debe ingresar valores del 1 al 10.");
                    }
                }
                
                case 3 -> {
                    //eliminar una reserva
                    System.out.println("Escriba la fila la cual quiera eliminar la reserva: ");
                    filaselec = teclado.nextInt();
                    System.out.println("Escriba la columna la cual quiera eliminar la reserva: ");
                    columnaselec = teclado.nextInt();
                    teclado.nextLine();
                    if (filaselec >= 1 && filaselec <= 10 && columnaselec >= 1 && columnaselec <= 10) {
                        if (nombres[filaselec-1][columnaselec-1].equals("Libre")) {
                            System.out.println("Este asiento no esta reservado. ");
                            System.out.println(" ");
                        }
                        else {
                            System.out.println("Este asiento esta reservado por: ");
                            System.out.println(nombres [filaselec-1] [columnaselec-1]+" ");
                            System.out.println(telefonos [filaselec-1] [columnaselec-1]);
                            System.out.println("Seguro que quiere eliminar la reserva?: ");
                            confirmacion = teclado.next();
                            if (confirmacion.equalsIgnoreCase("SI")) {
                                nombres[filaselec-1][columnaselec-1] = "Libre";
                                telefonos[filaselec-1][columnaselec-1] = "-";
                                System.out.println("Eliminacion de reserva realizada correctamente.");
                            }
                            else {
                                System.out.println("No se realizo la eliminacion de la reserva. ");
                                System.out.println(" ");
                            }
                        }
                    }
                    else {
                            System.out.println("Fila o columna inválida. Debe ingresar valores del 1 al 10.");
                    }           
                }
                
                case 4 -> {
                    System.out.println("Gracias por usar el menu de reservas, nos vemos!");
                }
                
                default -> System.out.println("Opcion invalida. Debe ingresar un valor del 1 al 4.");
       
            }
        }
    }     
}