import java.util.ArrayList;


public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> itemsInBox;
    
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        itemsInBox = new ArrayList<>();
    }
    
    public double weight() {
        double weight = 0;
        for (Packable packable : itemsInBox) {
            weight += packable.weight();
        }
        return weight;
    }
    
    public void add(Packable packable) {
        if (weight() + packable.weight() > maxCapacity) {
            return;
        } 
        itemsInBox.add(packable);
    }
    
    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + weight() + " kg";
    }
}
