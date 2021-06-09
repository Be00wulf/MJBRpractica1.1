//EjercicioCodigo11
import java.util.Scanner;
public class EjercicioCodigo11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numeroCM, numeroYD, numeroMTS, numeroPS, numeroPG;
        
        System.out.println("Ingrese el valor en centimetros ");
        numeroCM = entrada.nextDouble();
        
        numeroYD = numeroCM*0.0109;
    numeroMTS = numeroCM * 0.01;
    numeroPS = numeroCM * 0.032;
    numeroPG = numeroCM * 0.39;
        
        System.out.println("El valor del numero ingresado, pasado a yardas es " +numeroYD +"yds, a metros es de " + numeroMTS + "mts, a pies es de " + numeroPS + "pies, y a pulgadas es de " + numeroPG + "pulg");
        
    }
}