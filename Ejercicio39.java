/*
 * Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213
convertido a palabras sería:

cuatro, siete, cero, dos, uno, tres

Utiliza esta función en un programa para comprobar que funciona bien. Desde
la función no se debe mostrar nada por pantalla, solo se debe usar print desde
el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
final.
@Kuzafkto
 */
import maths.Digits;
public class Ejercicio39 {
    public static void main(String[] args) {
        System.out.print(Digits.convierteEnPalabras(258));
    }
}
