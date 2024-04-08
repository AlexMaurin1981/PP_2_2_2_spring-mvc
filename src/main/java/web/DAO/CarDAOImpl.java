package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {

    private static List<Car> showCar = new ArrayList<>();


    static {
        showCar.add(new Car(1, "BMW", 4));
        showCar.add(new Car(2, "AUDIO", 4));
        showCar.add(new Car(3, "MB", 6));
        showCar.add(new Car(4, "VW", 4));
        showCar.add(new Car(5, "LADA", 2101));
    }
    @Override
    public List<Car> getListCar(int count) {
        if (count == 0) {
            return showCar;
        }
        return showCar.stream().limit(count).collect(Collectors.toList());
    }
}
