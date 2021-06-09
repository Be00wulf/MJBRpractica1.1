//EjercicioCodigo19
import java.util.Scanner;
public class EjercicioCodigo19 {

    public static void main(String[] args) {

        double numero;
        
        numero = (int) (Math.random() * ( 50 + 10));
        
        System.out.println("El numero es:  " + numero);
        
        if (numero <= 25) {
            if (numero % 5 == 0) {
                System.out.println("Correcto");
            } else{
                System.out.println("Incorrecto");
            }
        } else {
            System.out.println("Incorrecto");
        }
 
    }
}