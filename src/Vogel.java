public abstract class Vogel extends Animal {

    @Override
    public String watch() {
        return "fliegt in der Luft";
    }

    @Override
    public boolean feed(String food) {
        if (this.isFed()) {
            System.out.println("ist bereits satt");
            return true;
        } else if (food.equals("maus") || food.equals("wurm") || food.equals("insekt")) {
            System.out.println("futter wird angenommen");
            return true;
        } else {
            System.out.println("futter wird abgelehnt");
            return false;
        }
    }

    @Override
    public String pet() {
        if (this.isFed())
            return "lässt sich streicheln";
        return "fliegt weg";
    }
}
