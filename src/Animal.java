public abstract class Animal implements Feedable, Pettable {
    private boolean fed;

    public boolean isFed() {
        return fed;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    public abstract String watch();
}
