public class Animal {

    private String name;
    private String color;
    private int age;
    private static int i;


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        i++;
    }

    boolean animalRun (int run){
        if (run > 0) {
            System.out.println(name + " пробежал " + run + " метров");
            return true;
        } else return false;

    }

    boolean animalJump (double jump){
        if (jump > 0) {
            System.out.println(name + " прыгнул на " + jump + " метров");
            return true;
        } else return false;

    }

    boolean animalSwim (int swim){
        if (swim > 0){
            System.out.println(name + " проплыл " + swim + " метров");
            return true;
        } else return false;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void howManyAnimals(){
        System.out.println("Всего создано животных: " + i);
    }

}
