package OOP;

public class Monopatin extends Vehicle {

    public Monopatin(int wheels, int velocity, String brand) {
        super(wheels, velocity, brand);
    }

    @Override
    public void accelerate() {
        this.velocity = 5;
    }


    @Override
    public void brake() {
        this.velocity -= 40;
    }

    @Override
    public String toString() {
        return ("el monopatin va a " + velocity+ "km/h");
    }
}
