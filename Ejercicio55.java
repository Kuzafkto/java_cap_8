
/*
 * Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro array con los mismos valores habiendo eliminado
las posibles repeticiones.

Se distinguen mayúsculas de minúsculas, por tanto
“hola” es distinto de “Hola”. 

Por ejemplo, si el array a contiene los valores
{“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”,
“sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”,
“coche”, “sol”, “mesa”, “ordenador”, “CASA”}. 
Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:

public static String[] sinRepetir(String[] s)
 @Kuzafkto
 */
import arrays.Array;
public class Ejercicio55 {
    public static void main(String[] args) {
        String s[]=new String[]{"casa","tomate","coche","sol","mesa","mesa","coche","ordenador","sol","CASA","CASA","tomate"};
        String[]s2=Array.sinRepetir(s);
        for(int i=0;i<s2.length;i++){
            if(i==s2.length-1){
                System.out.print(s2[i]);
            }else{
                System.out.print(s2[i]+", ");
            }
        } 
    }
}
