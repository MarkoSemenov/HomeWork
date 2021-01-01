    import java.util.Scanner;

    public class Lesson3_2 {

        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            guessWord(); //Игра: Угадай слово!
        }

        public static void guessWord() {

            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

            int randomNumber = (int) (Math.random() * words.length);
            String word = words[randomNumber];
            System.out.println("Угадайте слово ");

            while (true) {

                String userAnswer = scanner.nextLine();

                if (word.equals(userAnswer)) {
                    System.out.println("Вы угадали");
                    scanner.close();
                    break;

                } else {
                    for (int i = 0; i < userAnswer.length() && i < word.length(); i++) {
                        if (userAnswer.charAt(i) == word.charAt(i)) {
                        System.out.print(word.charAt(i));
                        } else System.out.print("*");
                    }
                }

                System.out.println();
                System.out.println("Длина слова " + word.length() + " букв(-ы)");
            }

        }

    }
