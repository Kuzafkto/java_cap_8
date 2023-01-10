/*
 * Implementa la función aleatorioDeArray con la cabecera que se muestra a
continuación:

public static int aleatorioDeArray(int[] a)

Esta función debe devolver un número del array escogido al azar entre todos
los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
prueba

 * @Kuzafkto
 */
import arrays.Array;
public class Ejercicio52 {
    public static void main(String[] args) {
        int[]a=Array.generaArrayInt(10, 2, 100);
        Array.muestraArray(a);
        System.out.print("\n"+Array.aleatorioDeArray(a));
    }
}
