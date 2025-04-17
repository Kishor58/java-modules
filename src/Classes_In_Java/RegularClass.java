package Classes_In_Java;

public class RegularClass {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Corolla", 2020, 100.0);
        car1.start();
    }
}
class Car {
    String model;
    int year;
    double rentalPrice;

    public Car(String model, int year, double rentalPrice) {
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    void start() {
        System.out.println("The car " + model + " is starting...");
    }

    void stop() {
        System.out.println("The car " + model + " has stopped.");
    }
}
