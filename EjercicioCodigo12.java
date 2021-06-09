//EjercicioCodigo12
import java.util.Scanner;
public class EjercicioCodigo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperaturaC, temperaturaF;
        
        System.out.println("Ingrese el valor en grados Celsius ");
        temperaturaC = entrada.nextDouble();
        
        temperaturaF = (temperaturaC * (9/5)) + 32;
        
        System.out.println("La temperatura en grados Fahrenheit es de " + temperaturaF);
        
    }
}