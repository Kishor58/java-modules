package Classes_In_Java;

public class InterfaceExample {
    public static void main(String[] args) {
        Engine car = new Car1();
        Engine motorcycle = new Motorcycle();

        car.startEngine();
        motorcycle.startEngine();
    }
}
interface Engine {
    void startEngine();
}

class Car1 implements Engine {
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Motorcycle implements Engine {
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
}
