/*
 * Crea las funciones cuyas cabeceras se muestran a continuación, observa que
tienen el mismo nombre:

public static int ocurrencias(int digito, int n)
public static int ocurrencias(int digito, int[] a)

La función ocurrencias devuelve el número de veces que aparece un dígito
dentro de un número (primera función) o bien el número de veces que aparece
un dígito en una serie de números contenidos en un array (segunda función).

Ejemplos:
console ocurrencias(8, 4672) devuelve 0 ocurrencias(5, 25153) devuelve 2 ocurrencias(2,
123456) devuelve 1 Si a = {714, 81, 9, 11}, ocurrencias(1, a) devuelve 4 Si a = {42, 13,
12345, 4}, ocurrencias(4, a) devuelve 3 Si a = {6, 66, 666}, ocurrencias(6, a) devuelve
6 console

Utiliza estas funciones en un programa para comprobar que funcionan bien
 * @Kuzafkto
 */
import arrays.Array;
public class Ejercicio54 {
    public static void main(String[] args) {
        int[]prueba= Array.generaArrayInt(5,3, 100);
        Array.muestraArray(prueba);
        System.out.println();
        System.out.println(Array.ocurrencias(2,25682));
        System.out.println(Array.ocurrencias(8,prueba));
    }
}
