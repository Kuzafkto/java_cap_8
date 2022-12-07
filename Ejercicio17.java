/*
 *
 *@author KuzaFkto
 */

import maths.Arithmetics;
import maths.Digits;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número binario para convertirlo a decimal: ");
        long n=sc.nextLong();
        int longitud=Digits.digitos(n);
        int resultado=0;
        for (int i=0;i<longitud;i++){
            int v=(Digits.digitoN(n,longitud-i));
            resultado+=v* Arithmetics.potencia(2,i);
        }
        System.out.printf("El valor de %d en binarios es el valor %d en decimal \n",n,resultado);

        int binario=1;
        while (n>0){
            int v=(int)n%2;
            binario= (int) Digits.pegaPorDetras2(binario,v);
            n/=2;
        }
        sc.close();
    }
}
