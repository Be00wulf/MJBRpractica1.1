//EjercicioCodigo6
public class  EjercicioCodigo6 {

    public static void main(String[] args) {
        double numero, extra, aumento;
        //Genera numero aleatorio entre el 1 y el 200
        numero = (int) (Math.random() * ( 200 + 1));
        
        System.out.println("El numero aleatorio es: " + numero);
        extra = (30 * numero) / 100;
        aumento = numero + extra;
        
        System.out.println("El numero aleatorio " + numero + " aumentado en un 30% es de " + aumento);
    

    }

}