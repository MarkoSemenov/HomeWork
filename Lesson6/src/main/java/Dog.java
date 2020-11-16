public class Dog extends Animal {

    private int run;
    private double jump;
    private int swim;
    private static int i;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        i++;
        this.run = 500;
        this.jump = 0.5;
        this.swim = 10;
    }


    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    @Override
    boolean animalRun(int run) {
        if (run > this.run){
            System.out.println(this.getName() + " не может пробежать более " + this.run + " метров");
            return false;
        }
        return super.animalRun(run);
    }

    @Override
    boolean animalJump(double jump) {
        if (jump > this.jump){
            System.out.println(this.getName() + " не может пригнуть выше " + this.jump + " метров");
            return false;
        }
        return super.animalJump(jump);
    }

    @Override
    boolean animalSwim(int swim) {
        if (swim > this.swim){
            System.out.println(this.getName() +  " не может проплыть больше " + this.swim + " метров");
            return false;
        }
        return super.animalSwim(swim);
    }

    public static void howManyDogs () {
        System.out.println("Создано собак: " + i);
    }
}
