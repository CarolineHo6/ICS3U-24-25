package hi;

abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("Im moving fast");
    }
    
}

class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("Im moving slow");
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle bi = new Bicycle();
        Car c = new Car();
        bi.move();
        c.move();
    }
}
