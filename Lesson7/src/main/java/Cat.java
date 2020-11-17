public class Cat {

    private int appetite;
    private boolean satiety;
    private String name;

    public Cat(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        System.out.println("Сытость: " + this.name + " " + this.satiety);
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void catEat (Plate plate){
        if (this.appetite < plate.getVolume()){
            plate.volumeReduction(appetite);
            this.satiety = true;
            System.out.println(this.name + " съел " + this.appetite + " ед. еды. ");
            System.out.println(this.name + " сыт: " + this.satiety);
        } else System.out.println(this.name + " не ест т.к. в тарелке не достаточно еды. Добавьте еды в тарелку!");


    }


}
