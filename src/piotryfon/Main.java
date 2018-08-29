package piotryfon;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        for(int i = 0; i < 10; i++) {

            int cyfra1 = getRandomNumberInRange(1, 9);
            int cyfra2 = getRandomNumberInRange(1, 9);
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
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
