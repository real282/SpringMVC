package Service;

import Dao.CarsDao;
import Dao.CarsDaoImp;
import Model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarsServiceImp implements CarsService {
    CarsDao dao = new CarsDaoImp();

    @Override
    public List<Car> getCars(int count) {
        return dao.getCars(count);
    }
}
