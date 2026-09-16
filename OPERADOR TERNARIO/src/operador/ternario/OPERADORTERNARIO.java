package operador.ternario;
import java.util.Scanner;
public class OPERADORTERNARIO {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        double promedio;
        String condicionFinal;
        System.out.println("Ingrese el promedio del alumno");
        promedio=teclado.nextDouble();
        condicionFinal = (promedio>=6) ? "aprobado." : "desaprobado.";
        System.out.println("La condicion final del alumno es "+ condicionFinal+" El promedio fue de "+promedio+". Y alan se la come doblada.");        
    }
        
}