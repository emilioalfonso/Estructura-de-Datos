package ejercicio6;
import java.util.Scanner;
public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 

/*En una carrera automovilística se desea calcular cuál es el menor tiempo realizado entre
cada uno de sus 12 competidores. Para ello, se pide un algoritmo que sea capaz de permitir
el ingreso por teclado del número de vehículo y el tiempo (en segundos) de cada
participante. Una vez encontrado el que realizó el mejor tiempo, se debe informar por
pantalla tanto el número de vehículo que utilizaba como el tiempo que llevó a cabo.
*/
        
        //declaracion de variables
        int v = 12;
        int vehiculos [] = new int [v];
        double tiempo [] = new double [v];
        
        //ingreso de numero de vehiculo y tiempo
        for (int i = 0; i < v; i++) {
            System.out.println("ingresa el numero del vehiculo n°"+(i+1)+": ");
            vehiculos [i] = teclado.nextInt();
            System.out.println("ingresa el tiempo realizado por el vehiculo "+vehiculos[i]);
            tiempo [i] = teclado.nextDouble();
        }
        
        //calculo de mejor tiempo
        double mejortiempo = tiempo[0]; 
        int vehiculoganador = vehiculos [0];
        for (int i = 0; i < v; i++) {
            if (tiempo[i] < mejortiempo) {
                mejortiempo = tiempo[i]; 
                vehiculoganador = vehiculos [i];
            }
        }
        
        //mostrar mensaje
        System.out.println("el vehiculo n°"+vehiculoganador+" tiene el mejor tiempo con "+ mejortiempo);

    }
    
}
