import java.io.IOException;

/**
 * Created by Alumnos on 31/03/2017.
 */
public class Principal {

    public static void lanzaExcepcion() throws IOException
    {
        throw new IOException("Excepcion verificada");

    }

    public static void lanzaExcepcionNoV() throws RuntimeException
    {
        throw new RuntimeException("Excepcion no verificada");

    }

    public static void main(String args[])
    {
        System.out.println();
        //Es obligatorio utilizar try-catch en excepciones verificadas si no estan dentro de un try-catch, no compilará
        // es decir aquellas excepciones que son subclases de RuntimeExcepcion
        try {
            lanzaExcepcion();
        } catch (IOException e) {
            System.out.println("Excepcion atrapada");
            e.printStackTrace();
        }
        //es opcional usar try-catch en excepciones no verificadas
        lanzaExcepcionNoV();
    }
}
