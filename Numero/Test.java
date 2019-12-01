
/**
 * Test para ejecutar la clase Numero y saber el resultado del numero ingresado.
 *
 * @author Gonzalez Pascual Melvin Paul
 * @version 2019 11 30
 */
public class Test//Inicio de la clase
{
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        //Contrusctor vacio de la clase
    }

    /**
     * Metodo main para ejecutar el metodo valuar(), el cual nos dice que es el numero ingresado.
     *
     * @param  String [] args Para ejecutar el main
     * @return Lo que es el numero
     */
    public static void main (String [] args){//Inicio del metodo
    Numero nu= new Numero();//Creacion de un nuevo objeto
    double n=-10.0;//Valor que se desea evaluar
    nu.valuar(n);//Ejecucio  del metodo
    }//Cierre del metodo
}//Fin de la clase
