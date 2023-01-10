/*
 *
 *@author KuzaFkto
 */
package arrays;

import java.security.DrbgParameters.Reseed;

import maths.Arithmetics;
import maths.Digits;

public class Array {

    public static void muestraArray(int[]a){
        System.out.print(a[0]);
        for(int i=1;i<a.length;i++){
            System.out.print(", "+a[i]);
        }
    }
    
    public static int[] generaArrayInt(int a, int min, int max){
        int[]res=new int[a];

        for (int i=0;i<a;i++){
            res[i]=(int)(min+(Math.random()*(max+1-min)));
        }
        return res;
    }

     public static int minimoArrayInt(int[]a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
     }

     public static int maximoArrayInt(int[]a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
     }

     public static float mediaArrayInt(int[]a){
        float average=0;
        for(int i=0;i<a.length;i++){
            average+=a[i];
        }
        return average/a.length;
     }

     public static boolean estaEnArrayInt(int a[],int number){
        for(int i=0;i<a.length;i++){
            if(a[i]==number){
                return true;
            }
        }
        return false;
     }

     public static int posicionEnArray (int a[],int number){
        for (int i=0;i<a.length;i++){
            if(a[i]==number){
                return i;
            }
        }
        return -1;
     }

     public static int[] volteaArrayInt(int a[]){
        int aux[]=new int[a.length];
        for(int i=a.length;i>0;i--){
            aux[a.length-i]=a[i-1];
        }
        return aux;
     }

     public static int[] rotaDerechaArrayInt(int a[], int amount){
        int aux[]=a.clone();
        while (amount>0){
            int first=aux[aux.length-1];
            for(int i=aux.length-1;i>0;i--){
                aux[i]=aux[(i-1)];
            }
            aux[0]=first;
            amount --;
        }
       
        return aux;
    }

    public static int[] rotaIzquierdaArrayInt(int a[], int amount){
        int aux[]=a.clone();
        while (amount>0){
            int last=aux[0];
            for(int i=0;i<aux.length-1;i++){
                aux[i]=aux[(i+1)];
            }
            aux[aux.length-1]=last;
            amount --;
        }
       
        return aux;
    }

    public static int [] filtraPrimos(int a[]){
// Devuelve un array con todos los
// números primos que se encuentren
// en otro array que se pasa como
// parámetro.
// Obviamente el tamaño del array
// que se devuelve será menor o
// igual al que se pasa como
// parámetro.
        int primeCounter=0;
        int[]aux=a.clone();
        for (int i=0;i<a.length;i++){
                if(Arithmetics.esPrimo(a[i])){
                    primeCounter++;
                }else{
                    aux[i]=-1;
                }
            
        }
        if(primeCounter==0){
            int[]noPrimes={-1};
            return noPrimes;
        }else{
            int []result=new int[primeCounter];
            int counter=0;
            for(int i=0;i<aux.length;i++){
                if(aux[i]!=-1){
                    result[counter]=aux[i];
                    counter++;
                }
            }
            return result;
        }
    }

    public static int[] filtraCapicuas(int x[]) {
        int capiCounter=0;
        int[]aux=x.clone();
        for (int i=0;i<x.length;i++){
                if(Digits.esCapicua(x[i])){
                    capiCounter++;
                }else{
                    aux[i]=-1;
                }
            
        }
        if(capiCounter==0){
            int[]noCapi={-1};
            return noCapi;
        }else{
            int []result=new int[capiCounter];
            int counter=0;
            for(int i=0;i<aux.length;i++){
                if(aux[i]!=-1){
                    result[counter]=aux[i];
                    counter++;
                }
            }
            return result;
        }
    }

    public static int[] filtraCon7(int x[]){
// Devuelve un array con todos los números
// que contienen el 7 (por ej. 7, 27, 782)
// que se encuentren en otro array que se
// pasa como parámetro. El tamaño del array
// que se devuelve será menor o igual al
// que se pasa como parámetro.
int sevenCounter=0;
int[]aux=x.clone();
        for(int i=0;i<x.length;i++){
            boolean hasSeven=false;
            for(int j=1;j<=Digits.digitos(x[i]);j++){
                if(Digits.digitoN(x[i], j)==7){
                    hasSeven=true;
                    break;
                }
            }
            if(hasSeven){
                sevenCounter++;
            }else{
                aux[i]=-1;
            }
        }
        if(sevenCounter==0){
            int[]noSeven={-1};
            return noSeven;
        }else{
            int []result=new int[sevenCounter];
            int counter=0;
            for(int i=0;i<aux.length;i++){
                if(aux[i]!=-1){
                    result[counter]=aux[i];
                    counter++;
                }
            }
            return result;
        }
    } 

    public static String convierteArrayEnString(int[] a){
        if(a.length==0){
            return "";
        }else{
         
            String result="";
            for(int i=0;i<a.length;i++){
                int counter=1;
                while(counter<=Digits.digitos(a[i])){
                    switch(Digits.digitoN(a[i],counter)){
                        case 1:
                        result+="1";
                        break;
                        case 2:
                        result+="2";
                        break;
                        case 3:
                        result+="3";
                        break;
                        case 4:
                        result+="4";
                        break;
                        case 5:
                        result+="5";
                        break;
                        case 6:
                        result+="6";
                        break;
                        case 7:
                        result+="7";
                        break;
                        case 8:
                        result+="8";
                        break;
                        case 9:
                        result+="9";
                        break;
                        case 0:
                        result+="0";
                        break;
                    }
                    counter ++;
                }
               
            }
            return result;
        }
    }

    public static int[] concatena(int[] a, int[] b){
        int[]result=new int[a.length+b.length];
        for(int i=0;i<result.length;i++){
            if(i<a.length){
                result[i]=a[i];
            }else{
                result[i]=b[i-a.length];
            }
        }
        return result;
    }

    public static int[] mezcla(int[] a, int[] b){
        int[]aux=new int[a.length+b.length];
      int counter=0;
        if(a.length>=b.length){
            for(int i=0;i<a.length;i++){
                if(i>b.length-1){
                    aux[counter]=a[i];
                    counter++;
                }else{
                    aux[counter]=b[i];
                    aux[counter+1]=a[i];
                    counter+=2;
                }

            }
        }else{
            for(int i=0;i<b.length;i++){
                if(i>a.length-1){
                    aux[counter]=b[i];
                    counter++;
                }else{
                    aux[counter]=a[i];
                    aux[counter+1]=b[i];
                    counter+=2;
                }

            }      
         }
         return aux;
       
    }

    public static int aleatorioDeArray(int[] a){
        return a[(int)(Math.random()*a.length)];
    }

    public static int ocurrencias(int digito, int[] a){
        int counter=0;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=Digits.digitos(a[i]);j++){
                if(Digits.digitoN(a[i], j)==digito){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static int ocurrencias(int digito, int n ){
        int a[]=new int[1];
        a[0]=n;
        return ocurrencias(digito, a);
    }

    public static String[] sinRepetir(String[] s){
        int counter=1;
        for(int i=1;i<s.length;i++){
            for(int j=i-1;j>=0;j--){
                if(s[j].equals(s[i])){
                    break;
                }
                if(j==0){
                    counter++;
                }
            }
        }
        String result[]=new String[counter];
        counter=1;
        result[0]=s[0];
        for(int i=1;i<s.length;i++){
            for(int j=i-1;j>=0;j--){
                if(s[j].equals(s[i])){
                    break;
                }
                if(j==0){
                    result[counter]=s[i];
                    counter++;
                }
            }
        }
        return result;
    }

}
