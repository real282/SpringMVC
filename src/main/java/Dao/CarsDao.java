package Dao;

import Model.Car;

import java.util.List;

public interface CarsDao {
    List<Car> getCars(int count);
}
