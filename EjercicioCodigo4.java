// Ejercicio 4
//EjercicioCodigo
import java.util.Scanner;
public class EjercicioCodigo4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado, cubo;
        
        System.out.println("Escribir un numero entero: ");
        numero = entrada.nextInt();
        
        cuadrado = numero * numero;
        cubo = numero * numero * numero;
        
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
}