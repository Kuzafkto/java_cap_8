/*
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas.

Ejemplo 1:
Introduzca la altura de la figura: 8
********
 *     *
  *    *
   *   *
    *  *
     * *
      **
       *
       
Ejemplo 2:
Introduzca la altura de la figura: 5
*****
 *  *
  * *
   **
    *

 * @Kuzafkto
 */

import varias.Varias;
import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese la altura del triangulo: ");
        int height=sc.nextInt();
        System.out.print("Por favor elija el caracter para imprimir la piramide: ");
        char caracter=sc.next().charAt(0);
        for(int i=height;i>0;i--){
            for(int j=height-i;j>0;j--){
                System.out.print(" ");
            }
            if(i==height||i==1){
                System.out.print(Varias.linea(caracter,i)+"\n");
            }else{
                System.out.print(Varias.lineaHueca(caracter,i)+"\n");
            }
            }
        
            sc.close();
    }
}
