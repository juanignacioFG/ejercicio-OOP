package OOP;

public class Car extends Vehicle{
    public Car(int wheels, int velocity, String brand) {
        super(wheels, velocity, brand);
    }
        @Override
        public void accelerate() {
            this.velocity += 40;
        }

        @Override
        public void brake() {
            this.velocity -= 40;
        }




}
