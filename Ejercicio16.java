/*
 *Muestra los números capicúa que hay entre 1 y 99999.
 *@author KuzaFkto
 */

import maths.Digits;


public class Ejercicio16 {
    public static void main(String[] args) {
        for(int i=1;i<100000;i++){
            if(i== Digits.voltea(i)){
                System.out.print((i+" "));
            }
        }

    }
}
