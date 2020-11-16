public class Lesson6 {

    public static void main(String[] args) {
        Cat cat = new Cat("Симон", "Серый", 10);
        Cat cat2 = new Cat("Пират", "белый", 5);
        Cat cat3 = new Cat("Ми-Ми", "Рыжий", 3);
        Dog dog = new Dog("Чаппи", "Коричневый", 4);
        Dog dog2 = new Dog("Амур", "Черный", 6);

        cat.setRun(350);
        cat2.setJump(5);

        cat.animalRun(350);
        cat2.animalJump(4);
        cat.animalJump(8);
        cat2.animalRun(250);

        System.out.println();
        cat3.setSwim(6);
        cat2.animalSwim(1);
        cat3.animalSwim(5);

        System.out.println();
        dog.animalJump(2);
        dog.animalRun(500);
        dog.animalSwim(8);

        System.out.println();
        dog2.setJump(1);
        dog2.animalJump(0.9);
        dog2.animalRun(600);
        dog2.animalSwim(5);

        System.out.println();
        Cat.howManyCats();
        Dog.howManyDogs();
        Animal.howManyAnimals();


    }
}
