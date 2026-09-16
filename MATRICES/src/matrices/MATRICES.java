package matrices;
import java.util.Scanner;
public class MATRICES {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int matriz [] [] = new int [3] [3];
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++){
                System.out.println("ingrese el valor para la fila "+f+" y columna "+c);
                matriz [f][c] = teclado.nextInt();
            }
        }
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++){ 
                System.out.println("fila: "+f+"; columna: "+c+"; Valor: "+matriz[f][c]);
            }
        }    
        
    }
    
}
