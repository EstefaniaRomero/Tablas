import java.util.Scanner;

//Demanar a l’usuari 6 números i guardar-los en una taula. Mostrar a pantalla la taula en l’ordre invertit:

  //      Entrada: 1 4 6 8 9 2

    //    Resultat: 2 9 8 6 4 1




public class Tablas {

    public static void main(String[] args) {

        int [] num = new int[6];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i <= 5 ; i++) {

            System.out.println("Introdueix el número en la posició: " + i);
            int option = sc.nextInt();
            num [i] = option;

        }
        for (int i = num.length-1; i >= 0; i--) {

            System.out.println(num[i]);


        }

    }
}
