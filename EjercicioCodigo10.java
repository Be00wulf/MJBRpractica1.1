//EjercicioCodigo10
import java.util.Scanner;
public class EjercicioCodigo10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area, perimetro;
        
        System.out.println("Ingrese el valor de la altura: ");
        altura = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de la base: ");
        base = entrada.nextDouble();
        
        area = base * altura;
        perimetro = (2*base) + (2*altura);
            
        System.out.println("El area es " + area + " y el perimetro es " + perimetro);
        
    }
}