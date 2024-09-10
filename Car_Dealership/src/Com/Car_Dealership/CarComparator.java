package Com.Car_Dealership;

import java.util.Comparator;

public class CarComparator {
    public static Comparator<Car> byPrice = new Comparator<Car>() {
        @Override
        public int compare(Car c1, Car c2) {
            return Double.compare(c1.getPrice(), c2.getPrice());
        }
    };

    public static Comparator<Car> byYear = new Comparator<Car>() {
        @Override
        public int compare(Car c1, Car c2) {
            return Integer.compare(c1.getYear(), c2.getYear());
        }
    };

    public static Comparator<Car> byMake = new Comparator<Car>() {
        @Override
        public int compare(Car c1, Car c2) {
            return c1.getMake().compareTo(c2.getMake());
        }
    };
}
