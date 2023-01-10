/*
 * Define la función convierteArrayEnString con la siguiente cabecera:
 * 
public static String convierteArrayEnString(int[] a)

Esta función toma como parámetro un array que contiene números y devuelve
una cadena de caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
“62501”.

 * @Kuzafkto
 */
import arrays.Array;

public class Ejercicio47 {
    public static void main(String[] args) {
        int[]prueba= Array.generaArrayInt(5,3, 100);
        Array.muestraArray(prueba);
        System.out.println();
        System.out.println(Array.convierteArrayEnString(prueba));
    }
}
