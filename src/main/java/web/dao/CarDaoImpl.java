package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    public List<Car> getListCars(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Nissan", "Almera", 14));
        list.add(new Car("Lada", "Vesta", 47));
        list.add(new Car("Uaz", "Patriot", 32));
        list.add(new Car("Kia", "Rio", 58));
        list.add(new Car("Lada", "Largus", 78));

        if (count < 1 || count > 4) return list;
        return list.stream().limit(count)
                .collect(Collectors.toList());
    }
}
