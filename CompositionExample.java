class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
