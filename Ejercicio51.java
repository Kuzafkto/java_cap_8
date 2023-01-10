/*
 * Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
continuación, el programa indicará para cada uno de ellos si es un número
primo y/o un capicúa de la forma que muestra el ejemplo.

Ejemplos:

Array generado:
19 22 57 11 3 52 32 46 2 14
El 19 es primo y no es capicúa.
El 22 no es primo y es capicúa.
El 57 no es primo y no es capicúa.
El 11 es primo y es capicúa.
El 3 es primo y es capicúa.
El 52 no es primo y no es capicúa.
El 32 no es primo y no es capicúa.
El 46 no es primo y no es capicúa.
El 2 es primo y es capicúa.
14 no es primo y no es capicúa.

 * @Kuzafkto
 */
import arrays.Array;
import maths.*;
public class Ejercicio51 {
    public static void main(String[] args) {
        int[]a=Array.generaArrayInt(10, 2, 100);
        System.out.print("Array generado:\n");
        Array.muestraArray(a);
        for(int i=0;i<a.length;i++){
            System.out.println("El "+a[i]+ (Arithmetics.esPrimo(a[i])?" es" : " no es")+" primo y"+(Digits.esCapicua(a[i])?" es" : " no es")+" capicua");
        }
    }
}
