import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int number, guess, nguess = 1;
        Scanner sc = new Scanner(System.in);
        number = 1 + (int) (100. * Math.random());

        do {
            System.out.println("Guess the number between 1 and 100\n");
            sc = new Scanner(System.in);

            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Lower number please\n");
            } else if (guess < number) {
                System.out.println("Higher number please\n");
            } else {
                System.out.printf("You guessed it in %d attempts\n", nguess);
            }
            nguess++;
        } while (guess != number);
        sc.close();
    }

}
