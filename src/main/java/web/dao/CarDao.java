package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getAllCarList();

    List<Car> getCarListByCount(List<Car> carList, int count);
}
