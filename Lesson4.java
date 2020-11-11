import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    private static boolean trueOrNot = false;
    public static int x;
    public static int y;
    public static int win;
    static Gamers player = new Gamers("Бывалый игрок", 18);
    static Gamers ai = new Gamers("R2D2", 30);
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static final char EMPTY_FIELD = '.';
    public static final int FIELD_SIZE = 5;
    public static char[][] map = new char[FIELD_SIZE][FIELD_SIZE];
    public static final char PLAYER_TOKEN = 'X';
    public static final char AI_TOKEN = 'O';
    public static final int DOT_TO_WIN = 4;

    static class Gamers {

        String name;
        int skill;

        public Gamers(String name, int skill) {
            this.name = name;
            this.skill = skill;
        }

    }


    public static void main(String[] args) {

        System.out.println("Добро пожаловать в игру <Крестики-нолики>!");
        gameProgress();

    }

    // инициализация игрового поля
    private static void initMap() {
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++) {
                map[i][j] = EMPTY_FIELD;
            }
    }


    // прорисовка игрового поля
    public static void printMap() {
        for (int i = 0; i <= FIELD_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //проверяем не выходят ли координады за рамки игрового поля
    public static boolean checkField(int x, int y) {
        if ((x > FIELD_SIZE) || x < 0) return false;
        if ((y > FIELD_SIZE) || y < 0) return false;
        if (map[y][x] != EMPTY_FIELD) return false;
        return true;
    }

    //ход игрока
    public static void playerProgress() {

        do {
            System.out.println("Введите координаты по оси x и y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!checkField(x, y));
        map[y][x] = PLAYER_TOKEN;
    }


    //Ход компьютера

    public static void aiProgress(int x, int y) {

        int r = random.nextInt(3);

        do {

            if ((y > x) && (y >= 0 && y < FIELD_SIZE - 1)) {

                if (r == 0) {
                    y += 1;
                } else x += r;

            } else if ((x > y) && (x >= 0 && x < FIELD_SIZE - 1)) {

                if (r == 0) {
                    x += 1;
                } else y += r;

            } else if (x == FIELD_SIZE - 1) {

                if (r == 0) {
                    x -= 1;
                } else x -= r;

            } else if (y == FIELD_SIZE - 1) {

                if (r == 0) {
                    y -= 1;
                } else y -= r;

            } else {

                if (r == 0) {
                    x = random.nextInt(FIELD_SIZE);
                } else y = random.nextInt(FIELD_SIZE);
            }

            if (map[y][x] == PLAYER_TOKEN || map[y][x] == AI_TOKEN) {
                x = random.nextInt(FIELD_SIZE);
                y = random.nextInt(FIELD_SIZE);
            }

        } while (!checkField(x, y));
        map[y][x] = AI_TOKEN;
    }


    //Метод заполнено ли поле или нет
    public static boolean isFieldFull() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (map[i][j] == EMPTY_FIELD) {
                    return false;
                }
            }
        }
        return true;
    }


    //Метод - кто победил
    public static boolean whoIsWin(char token) {

        for (int i = 0; i < FIELD_SIZE; i++) {
            win = 0;
            for (int j = 0; j < FIELD_SIZE; j++) {

                if (map[i][j] == token) {
                    win++;

                    if (win == DOT_TO_WIN) {
                        return true;
                    }

                } else win = 0;

            }
        }

        for (int i = 0; i < FIELD_SIZE; i++) {
            win = 0;
            for (int j = 0; j < FIELD_SIZE; j++) {

                if (map[j][i] == token) {
                    win++;

                    if (win == DOT_TO_WIN) {
                        return true;
                    }

                } else win = 0;

            }
        }

        //Проверяем диагонали
        checkMapDiagonalLeftToRight(0,1, FIELD_SIZE-1, token);
        checkMapDiagonalLeftToRight(1,0, FIELD_SIZE, token);
        checkMapDiagonalLeftToRight(0,0, FIELD_SIZE-1, token);

        checkMapDiagonalRightToLeft(5,1, 4, token);
        checkMapDiagonalRightToLeft(4,0, 3, token);
        checkMapDiagonalRightToLeft(5,0, 4, token);

        return trueOrNot;


    }

    public static void checkMapDiagonalRightToLeft(int arLength, int j, int i, char token){
        win = 0;
        for (j=j; j < arLength; j++) {
            if (map[j][i] == token) {

                win++;

                if (win == DOT_TO_WIN) {
                    trueOrNot = true;
                    break;
                }

            } else if (map[j][i] == EMPTY_FIELD){
                win = 0;
            }

            if (i > 0) {
                i--;
            }
        }
    }

    public static void checkMapDiagonalLeftToRight (int i, int j, int arLength, char token){
        win = 0;
        for (i = i; i < arLength; i++) {

            if (map[j][i] == token) {

                win++;

                if (win == DOT_TO_WIN) {
                    trueOrNot = true;
                    break;
                }

            } else if (map[j][i] == EMPTY_FIELD){
                win = 0;
            }

            if (j < FIELD_SIZE-1) {
                j++;
            }
        }
    }

    // основной игровой цикл
    public static void gameProgress(){

        initMap();
        printMap();

        while (true) {

            playerProgress();
            printMap();

            if (whoIsWin(PLAYER_TOKEN)) {
                System.out.println("Победил " + player.name);
                break;
            }

            if (isFieldFull()) {
                System.out.println("Все поля заполнены. Ничья!");
                break;
            }

            aiProgress(x, y);
            printMap();

            if (whoIsWin(AI_TOKEN)) {
                System.out.println("Победил " + ai.name);
                break;
            }

            if (isFieldFull()) {
                System.out.println("Все поля заполнены. Ничья!");
                break;
            }

        }

        System.out.println("Игра окончена");
        scanner.close();

    }
}