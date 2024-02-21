interface Vehicle {
    void manufacture();
}

class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured.");
    }
}
class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Motorcycle is being manufactured.");
    }
}

class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "car":
                return new Car();
            case "motorcycle":
                return new Motorcycle();
            default:
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        if (car != null) {
            car.manufacture();
        }
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        if (motorcycle != null) {
            motorcycle.manufacture();
        }
    }
}
