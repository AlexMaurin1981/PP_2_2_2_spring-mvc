package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CaServiceImpl implements CarService {
    @Autowired
    CarDAO carDAO;

    @Override
    public List<Car> getListCar(int count) {
        return carDAO.getListCar(count);

    }
}
