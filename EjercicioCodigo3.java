// Ejercicio 3
//EjercicioCodigo
import java.util.Scanner;
public class EjercicioCodigo3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, doble, triple;
        
        System.out.println("Escribir un numero entero: ");
        numero = entrada.nextInt();
        
        doble = numero *2;
        triple = numero * 3;
        
        System.out.println("El doble de numero es: " + doble);
        System.out.println("El triple de numero es: " + triple);
    }
}