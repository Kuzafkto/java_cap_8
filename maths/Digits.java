/*
 *
 *@author KuzaFkto
 */
package maths;

import java.math.BigInteger;

public class Digits {

    /*digitos*/
    public static int digitos (long x) {
        int counter=0;
        while (x>0){
            x/=10;
            counter++;
        }
        return counter;
    }
    /*digitos*/

    /*voltea*/
    public static long voltea(long x){
        long inv=0;
        while(x>0){
            inv=inv*10+(x%10);
            x/=10;
        }
        return inv;
    }
    /*voltea*/

    /*digitoN*/
    public static int digitoN(long x,int y){
        long aux=x;
        aux=digitos(aux);
        while(aux>=0){
           if(aux==y){
               return (int)x%10;
           }else{
               aux--;
               x/=10;
           }
        }
        System.out.print("\033[0;31m"+"ERROR! (digitoN), por favor ingrese una posición igual o mayor a la longitud del número.\n"+"\033[0m");
        return -1;
    }
    /*digitoN*/

    /*posiciónDeDigito*/

    //No se si comenzar a contar la posición desde 0 o desde 1, empezaré desde 1 en este caso.
    public static int posicionDeDigito(long x,int y){
        int digits=digitos(x);
        long aux=voltea(x);
        while(aux>0){
            if(aux%10==y){
                return (digitos(x))-(digits-1);//Para contar desde 0 hay que remover el -1.
            }else {
                aux/=10;
                digits--;
            }
        }
        return (digitos(x))-(digits-1);//Para contar desde 0 hay que remover el -1.
    }
    /*posiciónDeDigito*/

    /*esCapicua*/
    public static  boolean esCapicua(long x){
        return x == voltea(x);
    }
    /*esCapicua*/

    /*quitaPorDetras*/
    public static long quitaPorDetras(long x,int y){
        int digits=digitos(x);
        if(y<digits){
            return x/(long)Arithmetics.potencia(10,y);
        }else{
            System.out.print("\033[0;31m"+"ERROR! (quitaPorDetras), se está intentando quitar todos o los dígitos o mas de los que tiene el número.\n"+"\033[0m");
            return -1;
        }
    }
    /*quitaPorDetras*/

    /*quitaPorDelante*/
    public static long quitaPorDelante(long x, int y){
        int digits=digitos(x);
        if(y<digits){
            return x%(int)Arithmetics.potencia(10,digits-y);
        }else{
            System.out.print("\033[0;31m"+"ERROR! (quitaPorDelante), se está intentando quitar todos o los dígitos o mas de los que tiene el número.\n"+"\033[0m");
            return -1;
        }
    }
    /*quitaPorDelante*/

    /*pegaPorDetras*/
    public static long pegaPorDetras(long x,int y){
       if(y>0&&y<10){
           return x*10+y;
       }else{
           System.out.print("\033[0;31m"+"ERROR! (pegaPorDetras), el número a añadir debe ser de un dígito.\n"+"\033[0m");
           return -1;
       }

    }
    /*pegaPorDetras*/

    /*pegaPorDelante*/
    public static long pegaPorDelante(long x, int y){
        if(y>0&&y<10){
            return x+y*(long)Arithmetics.potencia(10,digitos(x));

        }else {
            System.out.print("\033[0;31m"+"ERROR! (pegaPorDelante), el número a añadir debe ser de un dígito.\n"+"\033[0m");
            return -1;
        }
    }
    /*pegaPorDelante*/

    /*trozoDeNumero*/
    public static long trozoDeNumero(long x, int y, int z){
        int counter=1;
        long n=0;
        long aux=voltea(x);
         if(y>0&&z<=digitos(x)){
             while (aux>0){
                 if(counter>=y&&counter<=z){//y es la posición inicial y z es la posición final.
                     n=n*10+aux%10;
                 }
                 counter++;
                 aux/=10;
             }
             return n;
         }else {
             System.out.print("\033[0;31m"+"ERROR! (trozoDeNumero), posición inicial y/o final fuera de rango.\n"+"\033[0m");
             return -1;
         }
    }
    /*trozoDeNumero*/

    /*juntaNumeros*/
    //acá hay un problema y es que no añade los ceros del medio
    public static BigInteger juntaNumeros(long x,long y){
        BigInteger z=BigInteger.valueOf(x);
       y=voltea(y);
        while(y>0){
            z = z.multiply(BigInteger.valueOf(10));
        z=z.add(BigInteger.valueOf(y).remainder(BigInteger.valueOf(10)));
            y/=10;
        }
        return z;
    }

/*juntaNumeros*/
        /*segunda idea (devuelve biginteger)
        public static BigInteger juntaNumeros2(long x,long y){
            String total=String.valueOf(x)+String.valueOf(y);
            return new BigInteger(total);
                }
            }
            segunda idea (devuelve biginteger)*/
}
