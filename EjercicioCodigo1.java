import java.util.Scanner;
public class EjercicioCodigo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, suma;
        
        System.out.println("Escribir un numero entero ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Escribir otro numero entero ");
        numero2 = entrada.nextDouble();
        
        suma = numero1 + numero2;
        
        System.out.println("La suma de ambos numeros es: " + suma);
        
    }
}