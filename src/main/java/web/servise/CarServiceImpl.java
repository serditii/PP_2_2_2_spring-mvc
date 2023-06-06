package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {
    private final CarDaoImpl carDao;

    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> getListCars(int count) {
        return carDao.getListCars(count);
    }
}
