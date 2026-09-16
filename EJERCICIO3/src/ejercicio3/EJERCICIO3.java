package ejercicio3;
import java.util.Scanner;
public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        
/*Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.*/  
        
        //ingreso de cantidad de productos
        System.out.println("ingresar cuantos productos son: ");
        int n = teclado.nextInt();
        int productos [] = new int [n];
        double costos [] = new double [n];
        
        //ingreso de los precios
        for (int i = 0; i < productos.length; i++) {
            System.out.println("ingresar el precio del producto n°"+(i+1));
            costos [i] = teclado.nextDouble();
        }
        
        //suma del total
        double suma = 0;
        for (int i = 0; i < productos.length; i++) {
            suma = suma + costos [i];
        }
        
        //mostrar datos 
        System.out.println("el precio total es de $"+suma+". ");
    
        //productos que superan los $1000
        for (int i = 0; i < productos.length; i++) {
            if (costos [i] >= 1000) {
                System.out.println("el producto n°"+(i+1)+" supera los 1000");
            }
        }
        
        
    }
    
}
