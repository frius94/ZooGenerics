public abstract class Raubtier extends Animal {

    @Override
    public String watch() {
        return "versteckt sich";
    }

    @Override
    public boolean feed(String food) {
        if (this.isFed()) {
            System.out.println("ist bereits satt");
            return true;
        }else if (food.equals("fleisch") || food.equals("wasser")) {
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
        return "läuft weg";
    }
}
