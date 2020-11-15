public class Lesson6 {

    public static void main(String[] args) {
        Cat cat = new Cat("Симон", "Серый", 10);
        Cat cat2 = new Cat("Пират", "белый", 5);
        Cat cat3 = new Cat("Ми-Ми", "Рыжий", 3);
        cat.setRun(350);
        cat.animalRun(350);
        cat2.animalRun(350);
        cat3.animalRun(250);


        cat2.setJump(5);
        cat.animalJump(8);
        cat2.animalJump(4);

        cat3.setSwim(6);
        cat2.animalSwim(0);
        cat3.animalSwim(5);

    }
}
