/*
 *
 *@author KuzaFkto
 */
package arrays;
import maths.Digits;

public class ArrayBi {

    public static void MuestraMatriz(int[][] a){
        int digitosMaximos=0;
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               int digitos= Digits.digitos(a[i][j]);
               if(digitos>digitosMaximos)
                digitosMaximos=digitos;
            }
            }
            String format="%"+digitosMaximos+"d ";
            for(int i=0;i<a.length;i++){
                for (int j=0; j<a[i].length;j++){
                    System.out.printf(format,a[i][j]);
                }
                System.out.println();
            }
        }
     /**
      * 
      * @param n Número de filas
      * @param m Número de columnas 
      * @param min Valor mínimo a generar en la matriz
      * @param max Valor máximo a generar en la matriz
      * @return
      */
       public static int[][] generaArrayBiInt(int n, int m,int min, int max){
        int [][]  a =new int [n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                a[i][j]=(int)(Math.random()*(max-min+1)+min);
            
        }
        return a;
    }
    /***
     * 
     * Devuelve la fila i-esima de un array suministrado
     * 
     * @param a Array de entrada
     * @param fila Fila a devolver del array 
     * @return Devuelve la fila i-esima de un array
     */

    public static int[] filaDeArrayBiInt(int [][] a,int fila ){
        if(a==null||a.length==0||fila <0||fila>=a[0].length)
            return null;
            return a[fila].clone();
    }

    /**
     * Devuelve la columna i-esima de un array suministrada
     * @param a Array de entrada
     * @param columna Columna a devolver del array
     * @return Devuelve la columna i-esima de un array suministrado
     */
    public static int [] columnaDeArrayBiInt(int[][]a, int columna){
        if (a==null||a.length==0||columna <0||columna>=a[0].length)
        return null;
        int[] ret=new int[a[0].length];
        for (int i=0;i<a[0].length;i++){
            ret[i]=a[i][columna];
        }
        return ret;
    }

    /***
     * Devuleve la fila y columna de la primera ocurrencia del valor v suministrada
     * Se busca el valor desde arriba hacia abajo y desde izquierda a derecha
     * @param a Matriz donde buscar el valor
     * @param v Valor a buscar
     * @return * Devuleve la fila y columna de la primera ocurrencia del valor v suministrada
     * Se busca el valor desde arriba hacia abajo y desde izquierda a derecha
     */
    public static int[]coordenadasEnArrayBiInt(int [][]a,int v){
        int [] ret= {-1,-1};
        boolean encontrado=false;
        if(a!=null&&a.length>0){
           for(int i=0;i<a.length && !encontrado;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]==v){
                    ret[0]=i;
                    ret[1]=j;
                    encontrado=true;
                    break;
                }
            }
           }
        }
        return ret;
    }

    /**
     * Devuelve si el elemento que está en la posición fila, columna de una matriz dada es un punto de silla o no 
     * 
     * Un elemento es punto de silla si es el minimo de la fila y el maximo de la columna
     * @param a
     * @param fil
     * @param col
     * @return
     */
    public static boolean esPuntoDeSilla(int [][]a, int fil,int col ){
        boolean ret=false;
        if(a==null||a[0].length>0||fil<0||fil>=a.length||col<0||col>=a[0].length)
        return false;
        int[] fila=filaDeArrayBiInt(a, fil);
        int[] columna=columnaDeArrayBiInt(a, col);
        //ret=Array.minimoArrayInt(fila)==a[fil][col]&&Array.maximoArrayInt(columna)==a[fil][col];
        return ret;
        //delete previous and put
         //return=Array.minimoArrayInt(fila)==a[fil][col]&&Array.maximoArrayInt(columna)==a[fil][col];
    }
    
}
