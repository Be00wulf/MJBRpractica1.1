//EjercicioCodigo20
import java.util.Scanner;
public class EjercicioCodigo20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        String numero;
        int d1=0, d2=0, d3=0, d4=0, d5=0;
   
        System.out.println("Ingrese un numero de 5 digitos");
        numero = entrada.next();
        valor = Integer.valueOf(numero);
        
        if(valor > 9999 && valor < 100000){
            //System.out.println("ERROR, NUMERO FUERA DE LIMITE");
        d1 = Character.getNumericValue(numero.charAt(0));
        d2 = Character.getNumericValue(numero.charAt(1));
        d3 = Character.getNumericValue(numero.charAt(2));
        d4 = Character.getNumericValue(numero.charAt(3));
                d4 = Character.getNumericValue(numero.charAt(4));
                
                System.out.println("Los digitos son: "+d1+", "+d2+", "+d3+", "+d4 +", "+ d5);
                
                if (d1 == d5 && d2 == d4 && d3 == d3) {
                   System.out.println("Es capicua");
                }else {
                   System.out.println("No es capicua");
                }
        }
        
    }
}