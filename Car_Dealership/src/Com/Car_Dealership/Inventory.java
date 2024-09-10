package Com.Car_Dealership;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Car> {
    private List<Car> cars;

    public Inventory() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void sortByComparator(Comparator<Car> comparator) {
        Collections.sort(cars, comparator);
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarInventoryIterator();
    }

    private class CarInventoryIterator implements Iterator<Car> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < cars.size();
        }

        @Override
        public Car next() {
            return cars.get(currentIndex++);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inventory:\n");
        for (Car car : cars) {
            sb.append(car).append("\n");
        }
        return sb.toString();
    }
}
