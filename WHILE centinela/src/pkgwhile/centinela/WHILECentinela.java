package pkgwhile.centinela;
import java.util.Scanner;
public class WHILECentinela {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
        boolean bandera = true;
        String repuesta;
        while (bandera == true) {
            System.out.println("mi bandera es" + bandera);
            System.out.println("queres terminar el while?");
            repuesta = teclado.next();
            if (repuesta.equalsIgnoreCase("si")) {
            bandera = false;
            }    
        }
    }
    
}
