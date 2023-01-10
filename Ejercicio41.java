/*
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en
los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
ya se realizó en el tema de bucles, ahora se trata de usar una función para
que la implementación sea más sencilla. Por ejemplo, se puede crear una
función linea(char caracter, int repeticiones) que pinte una línea con el carácter
especificado.

Ejemplo 1:
Introduzca la altura de la figura: 8
********
*******
******
*****
****
***
**
*

Ejemplo 2:
Introduzca la altura de la figura: 5
*****
****
***
**
*
@Kuzafkto
 */
import varias.Varias;
import java.util.Scanner;
public class Ejercicio41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese la altura del triangulo: ");
        int height=sc.nextInt();
        System.out.print("Por favor elija el caracter para imprimir la piramide: ");
        char caracter=sc.next().charAt(0);
        for(int i=height;i>0;i--){
            System.out.print(Varias.linea(caracter,i)+"\n");
        }
        sc.close();
    }
}