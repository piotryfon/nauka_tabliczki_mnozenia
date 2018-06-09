package piotryfon;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random losuj = new Random();
        Scanner scan = new Scanner(System.in);

        int score = 0;
        for(int i = 0; i < 10; i++) {

            int cyfra1 = losuj.nextInt(10);
            int cyfra2 = losuj.nextInt(10) + 1;
            System.out.print(cyfra1 + " * " + cyfra2 + " = ");
            int wynik = scan.nextInt();

            if(wynik == cyfra1 * cyfra2) {
                System.out.println("Dobrze!");
                score = score + 1;

            } else {
                System.out.println("Źle. Dobra odpowied to: " + (cyfra1 * cyfra2));
            }
            if(i == 9) {
                System.out.println("*****Koniec*****");
                System.out.println("Dobre odpowiedzi: " + score + '/' + 10);
            }
        }
        scan.close();
    }
}
