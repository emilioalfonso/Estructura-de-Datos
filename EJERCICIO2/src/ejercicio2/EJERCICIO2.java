package ejercicio2;
import java.util.Scanner;
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        
/*Cargar un vector con “n” notas e indicar la cantidad de aprobados (Notas mayores o
iguales a 6), la cantidad de desaprobados (Notas menores a 6)*/
        
        //ingreso de la cantidad de notas
        System.out.println("ingresar cuantas notas tiene el alumno: ");
        int n = teclado.nextInt();
        int notas [] = new int [n];
        
        //ingreso de notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese la nota n° "+(i+1));
            notas[i] = teclado.nextInt();
        }
        
        //calculo de cantidad de notas aprobadas y desaprobadas
        int cantidadaprobadas;
        cantidadaprobadas = 0;
        int cantidaddesaprobadas;
        cantidaddesaprobadas = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                cantidadaprobadas = cantidadaprobadas + 1;
            } else {
                cantidaddesaprobadas = cantidaddesaprobadas + 1;
            }
        }
        
        //mensaje de notas
        System.out.println("Hay " + cantidadaprobadas + " notas aprobadas y "+cantidaddesaprobadas + " notas desaprobadas");
        
    }
}
