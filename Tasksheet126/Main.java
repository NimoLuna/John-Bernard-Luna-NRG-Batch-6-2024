// Base class
class Vehicle {
    // Attributes for Vehicle class
    private String make;
    private String model;
    private int year;

    // Constructor for Vehicle class
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods for Vehicle attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Derived class
class Car extends Vehicle {
    // Additional attribute for Car class
    private int numberOfDoors;

    // Constructor for Car class
    public Car(String make, String model, int year, int numberOfDoors) {
        // Call the parent class (Vehicle) constructor
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display details of the car
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class to test the Car class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Display the details of the car
        myCar.displayDetails();
    }
}
