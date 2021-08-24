package Service;

import Model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CarsService {
    List<Car> getCars(int count);
}
