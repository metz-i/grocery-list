package Animal;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins){
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.print("Muscles moving");
    }

    private void moveBackFin() {
        System.out.print("Backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles(); // Extending this method (which comes from Animal.java)
        if (speed == "fast") {
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                ", fins=" + fins +
                ", gills=" + gills +
                '}' + super.toString();
    }
}
