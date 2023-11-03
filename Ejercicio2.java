import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        double nota=0;
        double notaTotal=0;
        int media=0;
        int aprobados=0;
        int suspensos=0;

        Scanner scan=new Scanner(System.in);

        while(nota!=-1){
            System.out.print("> ");
            nota= scan.nextInt();

            if (nota==-1&&notaTotal==0){
                System.out.println("No se han introducido calificaciones");
                break;
            }
            else if(nota==-1){
                System.out.println("La media es "+notaTotal/media);
                System.out.println("Aprobados: "+aprobados+" - Suspensos: "+suspensos);
                break;
            }

            notaTotal+=nota;
            media++;

            if(nota>=5){
                aprobados++;
            }
            else{
                suspensos++;
            }

        }


    }
}
