/*
 *
 *@author KuzaFkto
 */
package maths;


public class Arithmetics {

    /*esPrimo*/
    public static boolean esPrimo(int x) {
        boolean prime=true;
       if(x%2==0||x==0||x==1){
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
        if(y==0){
            return 1;
        }
        if(y<0){
            return 1/potencia(x,-y);
        }

        int n=1;
        for(int i=0;i<Math.abs(y);i++){
            n=n*x;
        }

        return n;
    }
    /*potencia*/

    public static long aBinario(long x){
        int decimal=0;
        int counter=0;
        while(x>0){
            decimal+=((x%2)*(int)Arithmetics.potencia(10, counter));
            x/=2;
            counter++;
        }
        return decimal;
    }


}
