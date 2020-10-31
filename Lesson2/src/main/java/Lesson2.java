public class Lesson2 {

    public static void oneZero() {
        int[] array = {1, 0, 0, 1, 0, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;

            } System.out.print(array[i]);
        }
    }

    public static void arFill() {

        int[] array = new int[8];
        for (int i = 0, k = 0; i < array.length; i++, k += 3) {
            array[i] = k;
            System.out.print(array[i] + " ");
        }
    }

    public static void multiplicationArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 6;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void doubleArr() {

        int[][] dbArray = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    dbArray[i][j] = 1;
                } // else dbArray[i][j] = 1+(i*2); Наполнение массива не нулями.
                System.out.print(dbArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lessOrMore() {

        int[] array = {4, 8, 1, 3, 28, 0, 23, 7};
        int max = array[0];
        int min = array[0];

        for (int j : array) {

            if (j > max) {
                max = j;

            } else if (j < min) {
                min = j;
            }
        }
        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);
        System.out.println();
    }

    public static boolean trueOrNot() {

        int[] array = {1, 6, 5, 4, 2, 2, 2, 8};

        int sum;
        int sumRigth;

        for (int i=0; i < array.length-1;i++) {
            sum = array[i] + array[i+1];

            for (int j = array.length - 1; j > array.length /2; j--) {
                if (sum == array[j]){
                    return true;
                } else {
                    sumRigth = array[j] + array[j - 1];
                }
                if (sum == sumRigth) {
                    return true;
                }

            }

        }
        return false;

    }

    public static void main(String[] args) {
        oneZero();
        System.out.println();
        arFill();
        System.out.println();
        multiplicationArray();
        System.out.println();
        doubleArr();
        lessOrMore();


    }

}