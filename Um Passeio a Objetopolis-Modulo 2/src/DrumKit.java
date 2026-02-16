public class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    public DrumKit() {
    }

    public DrumKit(boolean topHat, boolean snare) {
        this.topHat = topHat;
        this.snare = snare;
    }

    public boolean isTopHat() {
        return topHat;
    }

    public void setTopHat(boolean topHat) {
        this.topHat = topHat;
    }

    public boolean isSnare() {
        return snare;
    }

    public void setSnare(boolean snare) {
        this.snare = snare;
    }

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
}
