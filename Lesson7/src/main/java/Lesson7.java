public class Lesson7 {

    public static void main(String[] args) {

        Cat [] cats = new Cat[3];
        Cat cat = new Cat("Симон", 10);
        Cat cat2 = new Cat("Пират", 8);
        Cat cat3 = new Cat("Ненси", 6);
        cats [0] = cat;
        cats [1] = cat2;
        cats [2] = cat3;
        Plate plate = new Plate(20);

        cat.isSatiety();
        cat.catEat(plate);
        System.out.println("Объем еды в тарелке: " + plate.getVolume());
        System.out.println("Добавляем еды в тарелку");
        plate.addMeal(10);
        System.out.println("Объем еды в тарелке: " + plate.getVolume());
        cat.catEat(plate);

        cat2.catEat(plate);
        cat3.catEat(plate);


        for (int i = 0; i < cats.length; i++) {
            cats[i].isSatiety();
        }

        System.out.println("Объем еды в тарелке: " + plate.getVolume());

    }
}
