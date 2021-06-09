//EjercicioCodigo8
import java.util.Scanner;
public class EjercicioCodigo8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, numero3, promedio;
        
        System.out.println("Ingrese el primer valor ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo valor ");
        numero2 = entrada.nextDouble();
        
        System.out.println("Ingrese el tercer valor ");
        numero3 = entrada.nextDouble();
        
        promedio = (numero1 + numero2 + numero3)/3;
        
        System.out.println("El promedio de los numeros es " + promedio);
        
    }

}