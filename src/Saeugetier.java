public abstract class Saeugetier extends Animal {

    @Override
    public String watch() {
        return "schaut Besucher an";
    }

    @Override
    public boolean feed(String food) {
        if (this.isFed()) {
            System.out.println("ist bereits satt");
            return true;
        } else if (food.equals("fleisch") || food.equals("wasser") || food.equals("pflanzen")) {
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
        return "läuft weg";
    }
}
