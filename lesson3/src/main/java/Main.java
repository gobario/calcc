public class Main {
    public static void main(String[] args) {
        Box<Apple> boxOfApples = new Box<>();
        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());
        Box<Orange> boxOfOranges = new Box<>();
        boxOfOranges.add(new Orange());
        boxOfOranges.add(new Orange());
        System.out.println("Вес коробки с яблоками: " + boxOfApples.getWeight());
        System.out.println("Вес коробки с апельсинами: " + boxOfOranges.getWeight());
        System.out.println("Коробки равны по весу: " + boxOfApples.compare(boxOfOranges));
        Box<Apple> anotherBoxOfApples = new Box<>();
        boxOfApples.moveTo(anotherBoxOfApples);
        System.out.println("Вес первой коробки после пересыпания: " + boxOfApples.getWeight());
        System.out.println("Вес второй коробки после пересыпания: " + anotherBoxOfApples.getWeight());
    }
}
