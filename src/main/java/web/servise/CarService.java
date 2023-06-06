package web.servise;

import web.models.Car;

import java.util.List;

public interface CarService {

    List<Car> getListCars(int count);

}
