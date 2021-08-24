package Service;

import Dao.CarsDao;
import Dao.CarsDaoImp;
import Model.Car;

import java.util.List;

public class CarsServiceImp implements CarsService {
    CarsDao dao = new CarsDaoImp();

    @Override
    public List<Car> getCars(int count) {
        return dao.getCars(count);
    }
}
