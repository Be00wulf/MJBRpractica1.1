// Ejercicio 2
import java.util.Scanner;
public class EjercicioCodigo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String pais, capital;
        
        System.out.println("Escribir un pais ");
        pais = entrada.nextLine();
        
        System.out.println("Escribir su capital ");
        capital = entrada.nextLine();       
        
        System.out.println(capital + " es la capital de " + pais);
        
    }
}