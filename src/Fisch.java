public abstract class Fisch extends Animal {
    @Override
    public String watch() {
        return "schwimmt umher";
    }

    @Override
    public boolean feed(String food) {
        if (this.isFed()) {
            System.out.println("ist bereits satt");
            return true;
        } else if (food.equals("fischfutter")) {
            System.out.println("essen wird angenommen");
            return true;
        } else {
            System.out.println("essen wird abgelehnt");
            return false;
        }
    }

    @Override
    public String pet() {
        return "fische kann man nicht streicheln.";
    }
}
