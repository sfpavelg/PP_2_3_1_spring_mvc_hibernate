package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X6", 2023));
        carList.add(new Car("FORD", "F-150", 2009));
        carList.add(new Car("LAMBORGINI", "HURACAN", 2014));
        carList.add(new Car("PORSHE", "911", 1964));
        carList.add(new Car("VOLVO", "XC90", 2023));
    }

    @Override
    public List<Car> getAllCarList() {
        return carList;
    }

    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
