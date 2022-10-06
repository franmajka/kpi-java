package repository;

import java.util.ArrayList;

import model.Car;

public class CarRepository {

  public ArrayList<Car> getAll() {
    return cars;
  }

  public Car create(String brand, String model, int releaseYear, String color, int registrationNumber, int price) {
    Car car = new Car();

    car.setId(CarRepository.lastId++);
    car.setBrand(brand);
    car.setModel(model);
    car.setReleaseYear(releaseYear);
    car.setColor(color);
    car.setRegistrationNumber(registrationNumber);
    car.setPrice(price);

    CarRepository.cars.add(car);

    return car;
  }

  public Boolean delete(int id)
  {
    return CarRepository.cars.removeIf(car -> car.getId().equals(id));
  }

  private static ArrayList<Car> cars = new ArrayList<Car>();
  private static int lastId = 1;
}