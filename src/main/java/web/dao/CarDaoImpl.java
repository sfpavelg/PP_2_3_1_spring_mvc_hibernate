package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "X6", 2023));
        cars.add(new Car("FORD", "F-150", 2009));
        cars.add(new Car("LAMBORGINI", "HURACAN", 2014));
        cars.add(new Car("PORSHE", "911", 1964));
        cars.add(new Car("VOLVO", "XC90", 2023));
    }

    @Override
    public List<Car> getAllCarList() {
        return cars;
    }

    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
