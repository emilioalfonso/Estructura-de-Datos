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
        int opcion;
        
        for (int f = 0; f < 10; f++){
            for (int c = 0; c < 10; c++){
            nombres[f][c] = "Libre";
            telefonos[f][c] = "-";
            
        //opciones
        System.out.println("MENU DE RESERVAS DE CINE");
        System.out.println("1. Mostrar mapa de la sala");
        System.out.println("2. Realizar una Reserva");
        System.out.println("3. Eliminar una Reserva");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opcion: ");
        opcion = teclado.nextInt();
        

            }
        }
        
        switch (opcion) {
            case 1: 
                for (int f = 0; f < 10; f++){
                    for (int c = 0; c < 10; c++){
                    if (nombres[f][c].equals("Libre")) {
                        System.out.print("[L] ");} else {
                        System.out.print("[X] ");
                        }
                    }
                }
                break;
                
            case 2: 
                System.out.println("Escriba su nombre");
                System.out.println("Escriba su telefono");
                System.out.println("Escriba fila y columna la cual quiera reservar");
                break;
        
        
                
            }
        }
        
    }
    

