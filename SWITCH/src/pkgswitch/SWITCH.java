package pkgswitch;
import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {

        int dia;
        String nombredia;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese un numero del 1 al 7: ");
        dia = teclado.nextInt();
        
        switch (dia){
            case 1: nombredia="Lunes";
                break;
            case 2: nombredia="Martes";
                break;
            case 3: nombredia="Miercoles";
                break;
            case 4: nombredia="Jueves";
                break;
            case 5: nombredia="Viernes";
                break;
            case 6: nombredia="Sabado";
                break;
            case 7: nombredia="Domingo";
                break;
            default: nombredia="dia incorrecto";
        }
        System.out.println("El dia de la semana es: "+nombredia);
    }
    
}
