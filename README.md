# btw
git init
git add .
git commit -m "// Product interface
interface Vehicle {
    void manufacture();
}

// Concrete Product
class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured.");
    }
}

// Concrete Product
class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Motorcycle is being manufactured.");
    }
}

// Factory class
class VehicleFactory {
    // Factory method
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

// Client class
public class Main {
    public static void main(String[] args) {
        // Create a car
        Vehicle car = VehicleFactory.createVehicle("car");
        if (car != null) {
            car.manufacture();
        }

        // Create a motorcycle
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        if (motorcycle != null) {
            motorcycle.manufacture();
        }
    }
}
а"
git remote add origin <URL вашего репозитория на GitHub>
git push -u origin master
