/*
 *
 *@author KuzaFkto
 */
package maths;


public class Arithmetics {

    /*esPrimo*/
    public static boolean esPrimo(int x) {
        boolean prime=true;
       if(x%2==0){
           prime=false;
       }else{
            for(int i=3;i<(x/2)+1;i+=2){
                if(x%i==0){
                    prime=false;
                    break;
                }
            }
       }
       return prime;
    }
    /*esPrimo*/
/*siguientePrimo*/
    public static int siguientePrimo(int x){
        boolean prime;
        do{
           x++;
           prime=esPrimo(x);
        }while (!prime);
        return x;
    }
    /*siguientePrimo*/
/*potencia*/
    public static double potencia(int x,int y){
        return Math.pow(x,y);
    }
    /*potencia*/


}
