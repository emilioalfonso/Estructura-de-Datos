package ejercicio1;
import java.util.Scanner;
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        
/* Un alumno tiene “n” notas (Se ingresa por teclado la cantidad de notas) que se deben
cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
notas se debe mostrar la nota más alta y el promedio de notas. */
        
        //ingreso de la cantidad de notas
        System.out.println("ingresar cuantas notas tiene el alumno: ");
        int n = teclado.nextInt();
        int notas [] = new int [n];
        
        //ingreso de notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese la nota n° "+(i+1));
            notas[i] = teclado.nextInt();
        }
        
        //mostrar notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("la nota n°"+(i+1)+ " es: "+notas[i]);
        }
        
        //calculo de la nota mas alta
        int notaMayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }
        }
        
        //calculo del promedio
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = notas[i] + suma;
        }
        double promedio = suma / n; 
        
        //mostrar la nota mas alta y el promedio
        System.out.println("la nota mas alta es "+notaMayor+" y el promedio es "+promedio);
        
    }
    
}
