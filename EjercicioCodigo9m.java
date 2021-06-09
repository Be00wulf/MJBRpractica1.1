//EjercicioCodigo9
import java.util.Scanner;
public class EjercicioCodigo9m {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String a, b, reserva;
        
        System.out.println("Ingrese una palabra ");
        a = entrada.nextLine();
        
        System.out.println("Ingrese otra palabra ");
        b = entrada.nextLine();
        
        reserva = a;
        a = b;
        b = reserva;
        
        System.out.println("La primera palabra es " + a + " y la segunda palabra es " + b);
        
    }
}
