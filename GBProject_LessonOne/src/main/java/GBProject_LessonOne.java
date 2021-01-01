
public class GBProject_LessonOne {

      public static void main(String[] args) {


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

