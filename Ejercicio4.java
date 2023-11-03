import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int numeroPisos=0;
        int piso=0;
        int pisoAnterior=0;

        Scanner scan= new Scanner(System.in);

        while(piso!=-1){
            piso= scan.nextInt();

            if(piso==-1){
                break;
            }
            // bloqueado
        }
        System.out.println(numeroPisos);
    }
}
