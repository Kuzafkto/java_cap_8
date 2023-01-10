import varias.Varias;
import java.util.Scanner;

public class Ejercicio43 {
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
                System.out.print(Varias.linea(caracter,i)+"\n");
            }
        
            sc.close();
    }
}
