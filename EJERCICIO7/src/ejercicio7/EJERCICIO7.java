package ejercicio7;
import java.util.Scanner;
public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 

/*Se realizó un censo provincial y se desea procesar la información obtenida en dicho
censo. De cada una de las personas censadas se tiene la siguiente información: número de
documento, edad y sexo (‘F’ o ‘M’). Realizar un algoritmo que lea los datos de cada persona
censada (para fin de ingreso de datos, ingresar 0 (cero) como numero de documento) e
informe: Cantidad total de personas censadas, cantidad de varones y cantidad de mujeres,
porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones,
mostrar datos de la persona que registra la mayor edad.*/

        //declaracion de variables
        int dni;
        int total = 0;
        int varones = 0;
        int mujeres = 0;
        int edad = 0;
        String sexo;
        int varonesentre = 0;
        int personamayor = 0;
        double porcentaje = 0;
        int dnimayor = 0;
        String sexomayor = null;

        
        //insertar datos (dni, edad, sexo)
        System.out.println("Ingresar DNI (0 para terminar): ");
        dni = teclado.nextInt(); 
        while (dni != 0) {
            total++;
            System.out.println("Ingrese la edad");
            edad = teclado.nextInt();
            System.out.println("ingrese el sexo (m o f)");
            sexo = teclado.next();
            if (sexo.equalsIgnoreCase("m")) {
                varones ++;
                if (edad >= 16 && edad <= 65) {
                    varonesentre++;
                }
            } else if (sexo.equalsIgnoreCase("f")) {
                mujeres ++;
            }
            if (edad > personamayor) {
                personamayor = edad;
                dnimayor = dni;
                sexomayor = sexo;
            }
            System.out.println("Ingresar DNI (0 para terminar): ");
            dni = teclado.nextInt(); 
        }
        
        //calculo de porcentaje de varones
        if (varones > 0) {
            porcentaje = ((double)varonesentre / varones) * 100;
        }
        
        //mostrar datos 
        System.out.println(total+" personas fueron censadas, "+varones+" varones y "+mujeres+" mujeres");
        System.out.println("el " + porcentaje + "% de varones tienen entre 16 y 65 años");
        System.out.println("la persona con mayor edad es de "+personamayor+", es "+sexomayor+" y su dni es "+dnimayor);
        
    }
    
}
