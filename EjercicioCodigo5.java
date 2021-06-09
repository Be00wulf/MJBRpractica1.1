//EjercicioCodigo5
import java.util.Scanner;
public class EjercicioCodigo5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, siguiente;
        
        System.out.print("Escribir un numero entero: ");
        numero = entrada.nextInt();
        
        siguiente = numero + 1;
        
        System.out.println("El siguiente numero es " + siguiente);
        
    }
}