/*
 * Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3.

Ejemplo 1:
Introduzca la altura de la figura: 8
*             *
**           **
***         ***
****       ****
*****     *****
******   ******
******* *******
***************

Ejemplo 2:
Introduzca la altura de la figura: 5
*       *
**     **
***   ***
**** ****
*********

Ejemplo 3:
Introduzca la altura de la figura: 3
*   *
** **
*****

 * @Kuzafkto
 */
import varias.Varias;
import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese la altura del triangulo: ");
        int height=sc.nextInt();
        System.out.print("Por favor elija el caracter para imprimir la piramide: ");
        char caracter=sc.next().charAt(0);
        for(int i=height-1;i>0;i--){
            System.out.print(Varias.linea(caracter, height-i));
            System.out.print(Varias.linea(' ', i*2-1));
            System.out.print(Varias.linea(caracter, height-i)+"\n");
            }
            System.out.print(Varias.linea(caracter, height*2-1));

            sc.close();
    }
}
