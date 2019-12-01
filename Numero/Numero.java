
/**
 * Clase que nos evalua un numero y nos dice que si es positivo o negativo
 * nos pide un int y nos evalua.
 *
 * @author Gonzalez Pascual Melvin Paul.
 * @version 2019 11 30.
 */
public class Numero
{//Inicio de la clase
    /**
     * Constructor for objects of class Numero
     */
    public Numero()//Constructor de la clase
    {
       
    }

    /**
     * Metodo que nos indica si un numero es positivo, negativo o es cero.
     *
     * @param  n Un simple paramatro de tipo int, para evaluar el metodo.
     * @return    Un String con lo que sea el valor.
     */
    public static void valuar(double n){//Inicio del metodo, el cual nos indica lo que es el numero
    if(n>0) {System.out.println("Es positivo");}//Condicion que nos indica si es positivo
    if(n<0){ System.out.println("Es negativo");}//Condicion que nos indica si es negativo
    if(n==0){System.out.println("Es cero");}//Condicion que nos indica si es cero
    
   }//Fin del metodo
}//Fin de la clase
