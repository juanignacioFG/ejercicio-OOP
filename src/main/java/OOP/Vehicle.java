package OOP;

public class Vehicle {
    private String brand;
    protected int velocity;
    protected int wheels;

    public Vehicle(int wheels, int velocity, String brand) {
        this.wheels = wheels;
        this.velocity = velocity;
        this.brand = brand;
    }

    public void accelerate() {
        this.velocity += 10;
    }

    public void brake() {
        this.velocity -=10;

    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }
}

