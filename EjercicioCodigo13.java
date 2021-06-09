//EjercicioCodigo13
import java.util.Scanner;
public class EjercicioCodigo13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, altura, volumen;
        
        //Genera numero aleatorio entre el 10 y el 50
        //numero = (int) (Math.random() * ( 50 + 10));
        
        
        System.out.println("Ingrese el valor del radio ");
        radio = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de la altura ");
        altura = entrada.nextDouble();
        
        if (radio > 0 && altura > 0) {
            volumen = 3.1416 * radio * radio * altura;
            System.out.println("El volumen del cilindro es " + volumen);
            
        }   else {
            System.out.println("Debe ingresar datos positivos mayores a cero");
        }
                
        
    }
}