/*
 * Define la función concatena con la siguiente cabecera:
 * 
public static int[] concatena(int[] a, int[] b)

Esta función toma dos arrays como parámetros y devuelve un array que es el
resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }
 * 
 * @Kuzafkto
 */

 import arrays.Array;

public class Ejercicio48 {
    public static void main(String[] args) {
        int[]prueba= Array.generaArrayInt(5,3, 100);
        int[]prueba2= Array.generaArrayInt(5,3, 100);
        Array.muestraArray(prueba);
        System.out.println();
        Array.muestraArray(prueba2);
        System.out.println();
        Array.muestraArray(Array.concatena(prueba,prueba2));
    }
}
