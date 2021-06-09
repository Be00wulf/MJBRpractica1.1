//EjercicioCodigo14
import java.util.Scanner;
public class EjercicioCodigo14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;
        
        
        System.out.println("Ingrese el valor del numero 1 ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero 2");
        numero2 = entrada.nextDouble();
        
        if (numero1 % numero2 == 0) {
            System.out.println("Es divisible");
            
        }   else {
            System.out.println("No es divisible");
        }
                
        
    }
}