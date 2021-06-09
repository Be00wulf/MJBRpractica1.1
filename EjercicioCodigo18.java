//EjercicioCodigo18
import java.util.Scanner;
public class EjercicioCodigo18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        String numero;
        int suma, d1=0, d2=0, d3=0, d4=0;
   
        System.out.println("Ingrese un numero entre 0 y 9999");
        numero = entrada.next();
        valor = Integer.valueOf(numero);
        
        if(valor > 9999){
            System.out.println("ERROR, NUMERO FUERA DE LIMITE");
    } else if (valor > 999) {
        d1 = Character.getNumericValue(numero.charAt(0));
        d2 = Character.getNumericValue(numero.charAt(1));
        d3 = Character.getNumericValue(numero.charAt(2));
        d4 = Character.getNumericValue(numero.charAt(3));
                System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
    } else if( valor > 99) {
        d1 = 0;
        d2 = Character.getNumericValue(numero.charAt(0));
        d3 = Character.getNumericValue(numero.charAt(1));
        d4 = Character.getNumericValue(numero.charAt(2));
                System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
    } else if(valor > 9) {
        d1 = 0;
        d2 = 0;
        d3 = Character.getNumericValue(numero.charAt(0));
        d4 = Character.getNumericValue(numero.charAt(1));
                System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
    } else {
        d1 = 0;
        d2 = 0;
        d3 = 0;
        d4 = Character.getNumericValue(numero.charAt(0));
        System.out.println("Los digitos del número ingresado son: "+d1+", "+d2+", "+d3+", "+d4);
        }
        
        suma = d1+d2+d3+d4;
                System.out.println("La suma de los digitos es: "+suma);
        
    }
}