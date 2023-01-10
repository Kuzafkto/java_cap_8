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
        ret=Array.minimoArrayInt(fila)==a[fil][col]&&Array.maximoArrayInt(columna)==a[fil][col];
        return ret;
        //delete previous and put
         //return=Array.minimoArrayInt(fila)==a[fil][col]&&Array.maximoArrayInt(columna)==a[fil][col];
    }

    public static int[] diagonal (int [][] a, int fil,int col,String ori){
        int [] aux= new int[1000];
        int elementos=0;
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if((ori.equals("nose")&&(i<fil&&j>col
                        ||i>=fil&&j<=col)&&Math.abs(fil-1)==Math.abs(col-j))
                        ||(ori.equals("neso") && (i<fil&&j<col
                        ||i>fil&&j<col))){
                    aux[elementos]=a[i][j];
                    elementos++;
                }
            }
        }
        int [] res=new int [elementos];
        for(int i=0;i<aux.length;i++){
            res[i]=aux[i];
        }
        return res;
    }

    public static int nEsimo(int[][] n, int posicion){
        /*
         * First version (wrong one because doesn't returns -1 and doesn't checks the lenght of the line or/and row):
         *  return n[(posicion/(n.length+1))][(posicion%(n[(posicion/(n.length+1))].length))];
         */
      int counter=0;
      for(int i=0;i<n.length;i++){
        for (int j=0;j<n[i].length;j++){
            if(counter==posicion){
                return n[i][j];
            }else{
                counter++;
            }
        }
      }
      return -1;
    } 

    public static int[] corteza(int[][] n){
        int []aux=new int[(n[0].length-1)*2+(n.length-1)*2];
        int counter=0;
        for(int i=0;i<n[0].length;i++){
            aux[counter]=n[0][i];
            counter++;
        }
        for(int i=1;i<n.length;i++){
            aux[counter]=n[i][n[i].length-1];
            counter++;
        }
        for (int i=(n[n.length-1].length-1)-1;i>=0;i--){
            aux[counter]=n[n.length-1][i];
            counter++;
        }
        for(int i=n.length-2;i>=1;i--){
            aux[counter]=n[i][0];
            counter++;
        }
        return aux;
    }

}
