package hectoradivino;

import java.util.Scanner;

public class Aciertos {

    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (Math.random() * (51 - 10) + 10);// Devuelve un número aleatorio entre min (incluido) y max (excluido)
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
