import java.util.*;

public class guess_number {
    public static void main(String[] args) {
        
        int number, answer, count;
        Scanner sc = new Scanner(System.in);
        answer = (int)(Math.random() * 100 + 1);
        count = 0;

        for (; ; ) {
            System.out.printf("guess the number! (1~100) \n");
            number = sc.nextInt();
            count++;

            if (answer == number) {
                System.out.printf("correct! \n");
                break;
            }
            else if (answer < number) {
                System.out.printf("You dumbass. \n");
            }
            else if (answer > number) {
                System.out.printf("Fuck off. \n");
            }
        }
        
            if (count == 1) {
                System.out.printf("I love you! \n");
            }
            else if (count < 1 && count <= 6) {
                System.out.printf("You did... There's no choice... \n");
            }
            else if (count > 6) {
                System.out.printf("You killed %d people..... You suck. \n", count);
            }
    }
}
