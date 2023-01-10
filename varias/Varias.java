package varias;

public class Varias {
    public static String linea(char caracter, int repeticiones){
        String result="";
        for(int i=0;i<repeticiones;i++){
            result+=""+caracter;
        }
        return result;
    }
    public static String lineaHueca(char caracter, int repeticiones){
        String result="";
        for(int i=0;i<repeticiones;i++){
            if(i==0||i==repeticiones-1){
            result+=""+caracter;
            }else{
                result+=" ";
            }
        }
        return result;
    }
}
