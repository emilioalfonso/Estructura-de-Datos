package pkgif;
import java.util.Scanner;
public class IF {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int edad;
        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();
        if (edad > 18) {
            System.out.println("Sos mayor de 18");}
        else {
            if (edad == 18) {
                System.out.println("tenes exactamente 18");}
            else {
            System.out.println("No sos mayor de 18");
        }
        }
        
    }
    
}
