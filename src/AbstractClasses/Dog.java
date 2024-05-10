package AbstractClasses;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }
    @Override
    public void move(String speed) {

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds hair all the time");
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }
}
