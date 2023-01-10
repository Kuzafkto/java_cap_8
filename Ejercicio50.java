
/*
 * Define la función mezcla con la siguiente cabecera:
 * 
public static int[] mezcla(int[] a, int[] b)

Esta función toma dos arrays como parámetros y devuelve un array que es
el resultado de mezclar los números de ambos de forma alterna, se coge un
número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
longitudes diferentes; por tanto, si se terminan los números de un array se
terminan de coger todos los que quedan del otro.

Ejemplos:
Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}

 * @Kuzafkto
 */
import arrays.Array;

public class Ejercicio50 {
    public static void main(String[] args) {
        int[]prueba= Array.generaArrayInt(7,3, 100);
        int[]prueba2= Array.generaArrayInt(4,3, 100);
        Array.muestraArray(prueba);
        System.out.println();
        Array.muestraArray(prueba2);
        System.out.println();
        Array.muestraArray(Array.mezcla(prueba,prueba2));
    }
}
