package Model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Toyota Prius", 25000, "blue"));
        cars.add(new Car("Honda Accord", 32000, "orange"));
        cars.add(new Car("LADA Vesta", 10000, "black"));
        cars.add(new Car("BMW x6", 45000, "yellow"));
        cars.add(new Car("Suzuki Grand Vitara", 27000, "gray"));
    }

    public static List<Car> getCars(int count) {
        if (count > 5) count = 5;
        List<Car> carsRespondet = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carsRespondet.add(cars.get(i));
        }
        return carsRespondet;
    }
}
