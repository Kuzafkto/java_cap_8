/*
 * Escribe un programa que genere los n primeros términos de la sucesión look
and say. El primer término es 1. A continuación se va leyendo - un uno - por
tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc.
Se recomienda usar arrays para almacenar los dígitos porque los tipos int y
long son muy limitados en cuanto al número de dígitos. También puede resultar
de ayuda utilizar las funciones convierteArrayEnString y concatena definidas en los
ejercicios anteriores.

Ejemplo 1:
¿Cuántos términos de la sucesión look and say quiere calcular? 8
1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211

Ejemplo 2:
¿Cuántos términos de la sucesión look and say quiere calcular? 5
1, 11, 21, 1211, 111221

Ejemplo 3:
¿Cuántos términos de la sucesión look and say quiere calcular? 12
1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, 31131211131221, 13211311123113112211, 1\
1131221133112132113212221, 3113112221232112111312211312113211
 * 
 * @Kuzafkto
 */
import java.util.Scanner;
import arrays.Array;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos de la sucesión look and say quiere calcular?: ");
        int amount=sc.nextInt();
        int cant=0;
        int largo=1;
        int aux[]=new int[largo];
        aux[0]=1;
        Array.muestraArray(aux);
        System.out.print(", ");

        for(int i=0;i<amount-1;i++){
        largo*=2;
        int[]aux2=new int[largo];
        //calcula nuevo array
        int counter=0;
        for(int j=0;j<aux.length;j++){
        if(aux[j]==0){
            break;
        }
         cant=1;
         if(j+1<aux.length){
            while(aux[j]!=0&&aux[j]==aux[j+1]){
                cant++;
                j++;
                if(j+1>=aux.length){
                    break;
                }
            }
         }
         aux2[counter]=cant;
         aux2[counter+1]=aux[j];
         counter+=2;
        }
        for(int k=0;k<aux2.length;k++){
            if(aux2[k]!=0){
                System.out.print(aux2[k]);
            }
        }
        if(i<amount-2){
            System.out.print(", ");
        }
        //calcula nuevo array
        aux=new int[aux2.length];
        aux=aux2.clone();
        }

        sc.close();
    }
}
