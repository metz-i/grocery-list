package AbstractClasses;

public class Horse extends Animal {

    public Horse(String type, String size,
                 double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {
        if (type == "Clydesdale") {
            System.out.print("NEIGH! ");
        } else {
            System.out.print("neigh ");
        }
    }
}
