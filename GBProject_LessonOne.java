
public class GBProject_LessonOne {

      public static void main(String[] args) {

          short shRT = 25000;
          long LongNum = 6454646546L;
          String SayHello = "Hel";
          char Sym = 'l';
          char ch = 79;
          float fNum = 3.33F;
          boolean truFalse = true;

            System.out.println(SayHello+Sym+ch);
            System.out.println();
            System.out.println("1. "+Computation(5,8,9,11));
            System.out.println("2. "+ComparisonNumbers(25,9));
            System.out.println("3. "+PosOrNeg(5));
            System.out.println("4. "+CheckNum(-9));
            System.out.println("5. "+NameMethod("Марк"));
            System.out.println("6. "+CheckYear(2800));
        }

        public static double Computation (int a, double b, double c, int d){

            return a * (b + (c / d));

        }

        public static boolean ComparisonNumbers (int a, int b) {

            return a + b < 20 & a + b > 10;
        }

        public static String PosOrNeg (int numb){

            String tr = "Чило - "+numb+ " положительное";
            String fls  = "Число - "+numb+" отрицательное";
            if (numb >= 0) return tr;
            else return fls;

        }

        public static boolean CheckNum (int Num2){

            return Num2 < 0;
        }

        public static String NameMethod (String name){
            return "Привет, " + name+"!";
        }

        public static String CheckYear (float SomeYear) {
            String LeapYear = "Год - "+(int)SomeYear+ " високосный";
            String NonLeapYear  = "Год - "+(int)SomeYear+" не високосный";
            if ((SomeYear % 4 == 0) && (SomeYear % 100 != 0) || ((SomeYear % 400 == 0) && (SomeYear % 100 == 0))) return LeapYear;
            else return NonLeapYear;
        }

    }

