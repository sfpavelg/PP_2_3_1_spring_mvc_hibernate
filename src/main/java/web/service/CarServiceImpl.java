package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;


import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDAO) {
        this.carDao = carDAO;
    }
    @Override
    public List<Car> getAllCarList() {
        return carDao.getAllCarList();
    }


    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {
        return carDao.getCarListByCount(carList, count);
    }
}


