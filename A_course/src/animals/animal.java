package animals;

public class animal {
    private String volume = "......";
    private int legs;
    private boolean fur;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getLegs() {
        return legs;
    }

    /**
     * Set the number of legs.
     *
     * @param  legs  the number of legs to set
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }
}
