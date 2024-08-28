import java.util.*;

public class guess_number_game {
    int number, answer, count, level;
    Scanner sc = new Scanner(System.in);

    // 생성자: 게임 모듈 초기화
    public guess_number_game() {
        answer = 0;
        count = 0;
    }

    // 레벨 선택 메서드
    public void selectLevel() {
        System.out.println("Select the level. \n (1. basic 2. normal 3. hard)");
        level = sc.nextInt();
        switch (level) {
            case 1:
                answer = (int) (Math.random() * 25 + 1);
                break;
            case 2:
                answer = (int) (Math.random() * 50 + 1);
                break;
            case 3:
                answer = (int) (Math.random() * 100 + 1);
                break;
            default:
                System.out.println("Invalid level. Defaulting to level 1.");
                answer = (int) (Math.random() * 25 + 1);
        }
    }

    // 게임 메서드
    public void game() {
        while (true) {
            System.out.printf("Guess the number! (1 ~ %d) \n", getMaxNumber());
            number = sc.nextInt();
            count++;

            if (answer == number) {
                System.out.println("Correct!");
                break;
            } else if (answer < number) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Too low. Try again.");
            }
        }

        // 시도 횟수에 따른 결과 메시지
        if (count == 1) {
            System.out.println("Amazing! You got it on the first try!");
        } else if (count <= 6) {
            System.out.println("Good job! You guessed it in a few tries.");
        } else {
            System.out.printf("You guessed it after %d tries. Better luck next time!\n", count);
        }
    }

    // 각 레벨에 따른 최대 숫자 반환
    private int getMaxNumber() {
        switch (level) {
            case 1:
                return 25;
            case 2:
                return 50;
            case 3:
                return 100;
            default:
                return 25;
        }
    }

    // 메인 메서드
    public static void main(String[] args) {
        guess_number_game game = new guess_number_game();
        game.selectLevel();
        game.game();
    }
}
