public class Car {
    private int maxSpeed;
    private String model;
private Car(String model, int maxSpeed) {
    this.model = model;
    this.maxSpeed = maxSpeed;
    }
    public double getMaxSpeed() {
        return maxSpeed * 360.0 / 100.0;
    }
}
