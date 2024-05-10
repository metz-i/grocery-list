package AbstractClasses;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }
    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {
        if (type == "Shark") {
            System.out.print("Roar! ");
        } else {
            System.out.print("Glub glub! ");
        }
    }
}
