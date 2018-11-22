import

public class Main {

    public static void main(String[] args) {
       Car Mersedes = new Car("SLS AMG", 320);
       Car BMW = new Car("M5", 315);
       Car Audi = new Car("RS6", 340);

        System.out.println("Model: " + Mersedes.model + " maxSpeed: " + Mersedes.maxSpeed);
        System.out.println("Model: " + BMW.model + " maxSpeed: " + BMW.maxSpeed);
        System.out.println("Model: " + Audi.model + " maxSpeed: " + Audi.maxSpeed);

    }
}
