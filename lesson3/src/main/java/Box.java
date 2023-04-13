import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits = new ArrayList<>();
    public void add(T fruit) {
        fruits.add(fruit);
    }
    public float getWeight() {
        if (fruits.isEmpty()) return 0.0f;
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }
    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }
    public void moveTo(Box<T> otherBox) {
        if (this == otherBox) return;
        if (!fruits.isEmpty() && otherBox.getClass().equals(this.getClass())) {
            otherBox.fruits.addAll(fruits);
            fruits.clear();
        }
    }
}
