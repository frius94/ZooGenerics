import java.util.ArrayList;

public class Enclosure<T extends Animal>{

    private ArrayList<T> enclosure = new ArrayList<>();

    public Enclosure(ArrayList<T> enclosure) {
        this.enclosure = enclosure;
    }

    public ArrayList<T> getList() {
        return enclosure;
    }

    public void setEnclosure(ArrayList<T> enclosure) {
        this.enclosure = enclosure;
    }

    public Object get(int index) {
        return enclosure.get(index);
    }

    public void add(T animal) {
        enclosure.add(animal);
    }

}


