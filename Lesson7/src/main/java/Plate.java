public class Plate {

    private int volume;

    public Plate(int volume) {
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    void volumeReduction (int volume){
       if (this.volume >= volume){
            this.volume -= volume;
       }
    }

    void addMeal (int volume){
        this.volume +=volume;
    }

}
