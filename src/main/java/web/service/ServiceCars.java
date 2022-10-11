package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCars {

    private List<Car> carArrayList;

    {
        carArrayList = new ArrayList<>();
        carArrayList.add(new Car(123, "Toyota", "Blue"));
        carArrayList.add(new Car(456, "BMW", "Black"));
        carArrayList.add(new Car(789, "Porsche", "Red"));
        carArrayList.add(new Car(160, "Nisan", "Yellow"));
        carArrayList.add(new Car(381, "Honda", "Orange"));
    }

    public List<Car> allCars() {
        return carArrayList;
    }

    public List<Car> cars(int count) {
        if (count >= 5) {
            return carArrayList.subList(0, 5);
        }
        return carArrayList.subList(0, count);
    }

    public ServiceCars() {
    }

    public ServiceCars(List<Car> carArrayList) {
        this.carArrayList = carArrayList;
    }

    public List<Car> getCarArrayList() {
        return carArrayList;
    }

    public void setCarArrayList(List<Car> carArrayList) {
        this.carArrayList = carArrayList;
    }

}
