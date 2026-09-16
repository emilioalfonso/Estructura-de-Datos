package ejercicio.pkg4;
import java.util.Scanner;
public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 

/*Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 3
camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada
camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga
que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber
cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al
usuario.*/
        
        //variables / arrays
        int n = 3;
        String patentes [] = new String [n];
        String choferes [] = new String [n];
        String carga [] = new String [n];
        String hora [] = new String [n];
        int contador = 0;

        //ingreso de patente, nombre y apellido del chofer, tipo de carga y la hora de egreso
        for (int i = 0; i < n; i++) {
            System.out.println("ingresar la patente del camion n°"+(i+1)+": ");
            patentes [i] = teclado.nextLine(); 
        }
        for (int i = 0; i < n; i++) {
            System.out.println("ingresar el nombre y apellido del chofer del camion n°"+(i+1)+": ");
            choferes [i] = teclado.nextLine(); 
        }
        for (int i = 0; i < n; i++) {
            System.out.println("ingresar el tipo de carga del camion n°"+(i+1)+": ");
            carga [i] = teclado.nextLine(); 
        }
        for (int i = 0; i < n; i++) {
            System.out.println("ingresar la hora de egreso del camion n°"+(i+1)+": ");
            hora [i] = teclado.nextLine(); 
        }
        
        //cuantos camiones cargaron té
        for (int i = 0; i < n; i++) {
            if (carga[i].equalsIgnoreCase("té") || carga[i].equalsIgnoreCase("te")) {
                contador = contador + 1;
            }
        } 
        
        //mostrar datos
        System.out.println("Los datos son los siguientes");
            for (int i = 0; i < n; i++) {
                System.out.println("la patente del camion n°"+(i+1)+" es:"+ patentes[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.println("el chofer del camion n°"+(i+1)+" es:"+ choferes[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.println("la carga del camion n°"+(i+1)+" es:"+ carga[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.println("la hora de egreso del camion n°"+(i+1)+" es:"+ hora[i]);
            }
            System.out.println(contador + " camiones cargaron te");
    }
    
}
