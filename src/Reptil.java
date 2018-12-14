public abstract class Reptil extends Animal {

    @Override
    public String watch() {
        return "bewegt sich nicht/nie";
    }

    @Override
    public boolean feed(String food) {
        if (this.isFed()) {
            System.out.println("ist bereits satt");
            return true;
        } else if (food.equals("insekt") || food.equals("wasser") || food.equals("fleisch")) {
            System.out.println("essen wird angenommen");
            return true;
        } else {
            System.out.println("essen wird abgelehnt");
            return false;
        }
    }

    @Override
    public String pet() {
        if (this.isFed())
            return "lässt sich streicheln";
        return "kriecht weg";
    }
}
