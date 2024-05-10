package Animal;
public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight <  15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "Wolf") {
            // type is inherited by Dog - but while it is private to Animal,
            // it will throw an error
            // if you want subclasses to access a modifier - need protected
            System.out.print("Ow woooo!");
        };
        bark();
        System.out.println("Making some noise woo");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println(
                "Dogs walk, run and wag their tail");
    }

    private void wagTail() {
        System.out.print("Dog wagging tail");
    }
    private void bark() {
        System.out.print("Woof");
    }

    private void run() {
        System.out.print("Dog running");
    }

    private void walk() {
        System.out.print("Dog walking");
    }
}
