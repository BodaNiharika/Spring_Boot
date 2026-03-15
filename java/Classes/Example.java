package Classes;

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

public class Example {

    Engine engine = new Engine();

    public void drive() {
        engine.start();
        System.out.println("Car running");
    }
}