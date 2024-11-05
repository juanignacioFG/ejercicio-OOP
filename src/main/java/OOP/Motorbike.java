package OOP;

public class Motorbike extends Vehicle {
    public Motorbike(int wheels, int velocity, String brand) {
        super(wheels, velocity, brand);


    }
    @Override
    public void accelerate() {
        this.velocity += 40;
    }
}
