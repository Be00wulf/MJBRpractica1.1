//EjercicioCodigo16
import java.util.Scanner;
import jdk.nashorn.api.tree.BreakTree;
public class EjercicioCodigo16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, numero3;
        
        System.out.println("Ingrese el valor del numero 1 ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero 2 ");
        numero2 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero 3 ");
        numero3 = entrada.nextDouble();
        
        //evaluar mayor
        if (numero1 > numero2) {
            if (numero1 > numero3){
                System.out.println("El numero mayor es " + numero1);
            }  else {
            System.out.println("El numero mayor es " + numero3);
            }    
        } else if (numero3 > numero2) {
            System.out.println("El numero mayor es " + numero3);
        } else { 
            System.out.println("El numero mayor es " + numero2);
        }
        
        
    }
}