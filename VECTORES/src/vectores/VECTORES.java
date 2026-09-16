package vectores;
import java.util.Scanner;
public class VECTORES {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numeros [] = new int [7];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("ingrese el valor del indice "+ i);
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Los valores ingresaron fueron: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("el indice "+i+" tiene el valor de "+numeros[i]);
        } 
    }   
}
