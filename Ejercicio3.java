import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int altura=0;

        Scanner scan=new Scanner(System.in);

        altura= scan.nextInt();

        if(altura%2!=0) {

            for (int i = 0; i < altura; i++) {

                System.out.print(" ");

                for (int j = 0; j < altura-2 ; j++) {

                    System.out.print("*");

                }

                System.out.println();

            }
        }
    }
}
