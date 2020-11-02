public class Lesson1 {

    public static void main(String[] args) {

        short shRT = 25000;
        long longNum = 6454646546L;
        String sayHello = "Hel";
        char sym = 'l';
        char ch = 79;
        float fNum = 3.33F;
        boolean truFalse = true;

        System.out.println(sayHello+sym+ch);
        System.out.println();
        System.out.println("1. "+computation(5,8,9,11));
        System.out.println("2. "+comparisonNumbers(25,9));
        System.out.println("3. "+posOrNeg(5));
        System.out.println("4. "+checkNum(-9));
        System.out.println("5. "+nameMethod("Марк"));
        System.out.println("6. "+checkYear(2800));
    }

    public static double computation (int a, double b, double c, int d){

        return a * (b + (c / d));

    }

    public static boolean comparisonNumbers (int a, int b) {

        return a + b < 20 & a + b > 10;
    }

    public static String posOrNeg (int numb){

        String tr = "Чило - "+numb+ " положительное";
        String fls  = "Число - "+numb+" отрицательное";
        if (numb >= 0) return tr;
        else return fls;

    }

    public static boolean checkNum (int Num2){

        return Num2 < 0;
    }

    public static String nameMethod (String name){
        return "Привет, " + name+"!";
    }

    public static String checkYear (float someYear) {
        String LeapYear = "Год - "+(int)someYear+ " високосный";
        String NonLeapYear  = "Год - "+(int)someYear+" не високосный";
        if ((someYear % 4 == 0) && (someYear % 100 != 0) || ((someYear % 400 == 0) && (someYear % 100 == 0))) return LeapYear;
        else return NonLeapYear;
    }

}