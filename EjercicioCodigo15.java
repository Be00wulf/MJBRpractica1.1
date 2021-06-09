//EjercicioCodigo15
import java.util.Scanner;
public class EjercicioCodigo15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        
        System.out.println("Ingrese un numero ");
        numero1 = entrada.nextDouble();
        
        if (numero1 < 0) {
            System.out.println("Numero negativo");
            
        }   else if (numero1 > 0) {
            System.out.println("Numero positivo");
            
        }   else {
            System.out.println("Numero nulo");
        }
                
        
    }
}