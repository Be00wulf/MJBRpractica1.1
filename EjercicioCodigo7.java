//EjercicioCodigo7
public class EjercicioCodigo7 {

    public static void main(String[] args) {
        double numero, perdida, disminucion;
        //Genera numero aleatorio entre el 10 y el 50
        numero = (int) (Math.random() * ( 50 + 10));
        
        
        System.out.println("El numero aleatorio es: " + numero);
        perdida = (15 * numero) / 100;
        disminucion = numero - perdida;
        
        System.out.println("El numero aleatorio disminuido en un 15% es " + disminucion);
        
    }
}