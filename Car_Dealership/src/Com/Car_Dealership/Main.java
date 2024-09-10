package Com.Car_Dealership;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addCar(new Car("Toyota", "Camry", 2020, 24000));
        inventory.addCar(new Car("Honda", "Civic", 2022, 22000));
        inventory.addCar(new Car("Ford", "Mustang", 2019, 27000));

        System.out.println("Original Inventory:");
        System.out.println(inventory);

        inventory.sortByComparator(CarComparator.byPrice);
        System.out.println("Sorted by Price:");
        System.out.println(inventory);

        inventory.sortByComparator(CarComparator.byYear);
        System.out.println("Sorted by Year:");
        System.out.println(inventory);

        // Clone a car
        Car clonedCar = inventory.iterator().next().clone();
        System.out.println("Cloned Car:");
        System.out.println(clonedCar);
    }
}
