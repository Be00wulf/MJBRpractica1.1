//EjercicioCodigo17
import java.util.Scanner;
import jdk.nashorn.api.tree.BreakTree;
public class EjercicioCodigo17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, numero3;

        System.out.println("Ingrese el valor del numero 1 ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero 2 ");
        numero2 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del numero 3 ");
        numero3 = entrada.nextDouble();
        
        //evaluar 
        if (numero1 == numero2) {
            if (numero2 == numero3){
                System.out.println("Es un triangulo equilatero");
            }  else {
            System.out.println("Es un triangulo isosceles");
            }    
        } else if (numero2 == numero3) {
            System.out.println("Es un triangulo isosceles");
        } else if (numero1 == numero3) {
            System.out.println("Es un triangulo isosceles");
        } else {
            System.out.println("Es un triangulo escaleno");
        }
        
        
    }
}