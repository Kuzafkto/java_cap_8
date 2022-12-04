/*
 *
 *@author KuzaFkto
 */

import maths.Digits;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para convertirlo a binario: ");
        int n=sc.nextInt();
        System.out.print(Digits.aBinario(n));

        sc.close();
    }
}
