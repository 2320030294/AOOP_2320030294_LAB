package Com.Car_Dealership;

public class Car implements Comparable<Car>, Cloneable {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public int compareTo(Car other) {
        return this.model.compareTo(other.model);
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return String.format("%d %s %s - $%.2f", year, make, model, price);
    }

    // Getters and setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
