import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroInicial=10;

        Scanner scan=new Scanner(System.in);

        System.out.print("> ");
        int numero= scan.nextInt();

        while(numero%2==0&&numeroInicial<numero){

            System.out.print(numeroInicial+" ");
            numeroInicial+=5;

        }

        while(numero%2!=0&&numeroInicial<numero){

            System.out.print(numeroInicial + " ");
            numeroInicial += 3;
        }

    }

}
