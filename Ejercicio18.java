/*
 * Escribe un programa que pase de decimal a binario.
 *@author KuzaFkto
 */

import java.util.Scanner;
import maths.Arithmetics;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número a pasar a binario: ");
        int n=sc.nextInt();
        /*
        String binary= "";
        while (n>0) {
            binary=n%2+binary;
            n/=2;
        }
        System.out.print(binary);*/

        int contador=0;
        int decimal=0;
        while(n>0){
            decimal+=((n%2)*(int)Arithmetics.potencia(10, contador));
            n/=2;
            contador++;
        }
System.out.print(decimal);
        sc.close();
    }
}
