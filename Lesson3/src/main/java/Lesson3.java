
    import java.util.Scanner;

    public class Lesson3 {

        public static Scanner scanner = new Scanner(System.in);
        public static int score = 0;

        public static void main(String[] args) {
            guessNumber(); //Игра: Угадай число!
        }

        public static void repeatOrNot () {

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int userAnswer = scanner.nextInt();

            if (userAnswer == 0) {
                System.out.println("Игра окончена. Вы набрали очков: "+ score);
                scanner.close();

            } else guessNumber();
        }

        public static void guessNumber() {

            int randomNumber = (int) (Math.random() * 9);
            int i = 3;
            System.out.println("Угадайте число от 0 до 9. У Вас есть " + i + " попытки");

            while (i > 0) {

                int userAnswer = scanner.nextInt();

                if (userAnswer == randomNumber) {
                    System.out.println("Поздравляю Вы угадали!");
                    score++;
                    break;

                } else if (userAnswer > randomNumber) {

                    System.out.println("Загаданное число меньше. Осталось попыток: " + (--i));

                } else System.out.println("Загаданное число больше. Осталось попыток: " + (--i));

                if (i==0) {
                    System.out.println("Вы проиграли. Загаданное число: " + randomNumber);
                    break;

                }
            }
            repeatOrNot();

        }
    }


