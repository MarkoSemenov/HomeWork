public class Cat extends Animal{
    private int swim;
    private int jump;
    private int run;


    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.swim = 0;
        this.jump = 2;
        this.run = 200;

    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    boolean animalRun(int run) {
        if (run > this.run) {
            System.out.println(this.getName() + " не может пробежать более " + this.run + " метров");
            return false;
        }

        return super.animalRun(run);
    }

    @Override
    boolean animalJump(int jump){
        if (jump > this.jump){
            System.out.println(this.getName() + " не может пригнуть выше " + this.jump + " метров");
            return false;
        }

        return super.animalJump(jump);
    }

    @Override
    boolean animalSwim(int swim){
        if (swim > this.swim){
            System.out.println(this.getName() + " не умеет плавать");
            return false;
        }

        return super.animalSwim(swim);
    }



}
