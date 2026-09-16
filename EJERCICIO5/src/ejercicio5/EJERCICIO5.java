package ejercicio5;
import java.util.Scanner;
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 

/*Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que
permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del
cliente y tipo de servicio. Los tipos de servicio son 3: 1. Internet 30 megas (El servicio
cuesta: $750) 2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El
servicio cuesta: $1500 – menos 5% de descuento por promoción) El algoritmo debe poder
calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e
informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio
con el que cuenta.*/

        //declaracion de variables
        int c = 5;
        int dni [] = new int [c];
        int servicio [] = new int [c];
        String tipodeservicio = null;
        
        //ingreso de dni y tipo de servicio
        for (int i = 0; i < c; i++) {
            System.out.println("Ingresa el DNI del cliente n°"+(i+1)+": ");
            dni[i] = teclado.nextInt(); 
            System.out.println("TIPO DE SERVICIOS");
            System.out.println("1. Internet 30 megas: $750)");
            System.out.println("2. Internet 50 megas: $1100)");
            System.out.println("3. Internet 100 megas: $1500 – menos 5% de descuento por promoción");
            System.out.println("Ingresa el tipo de servicio del cliente de dni "+dni[i]+": ");
            servicio[i] = teclado.nextInt(); 
        }
        
        //calculo 
        for (int i = 0; i < c; i++) {
            switch (servicio[i]) {
                case 1: tipodeservicio = " tiene el servicio de Internet 30 megas, y debera pagar $750.";
                    break;
                case 2: tipodeservicio = " tiene el servicio de Internet 50 megas, y debera pagar $1100.";
                    break;
                case 3: tipodeservicio = " tiene el servicio de Internet 100 megas, y debera pagar $1425.";
                    break;
                default: tipodeservicio = "tipo de servicio incorrecto"; 
            }
            System.out.println("El cliente de dni "+dni[i]+tipodeservicio);
        }
        
    }
    
}
