import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alumnos on 30/03/2017.
 */
public class Principal
{
    /**
     * Este método realiza la división de dos números
     * @param num1 valor del primer número
     * @param num2 valor del segundo número
     * @return regresa la división
     */
    public static int divideNumeros(int num1, int num2)
    {
        return num1/num2;
    }
    public static void main(String [] args )
    {
        Scanner entrada = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.print("Valor del primer número: ");
                int numero1 = entrada.nextInt();
                System.out.print("Valor del segundo número: ");
                int numero2 = entrada.nextInt();
                int resultado = divideNumeros(numero1, numero2);
                System.out.println(resultado);
                correcto=true;
            }catch (InputMismatchException excepcionEntrada)
            {
                System.out.println("La entrada no concuerda con un número entero ");
                entrada.nextLine();
            }catch (ArithmeticException excepciónAritmetica)
            {
                System.out.println("El denominador no puede ser 0 ");
        }

        }while(!correcto);

    }
}
