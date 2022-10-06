package repository;

import java.util.ArrayList;

import model.Car;

public class CarRepository {
  public ArrayList<Car> findAll() {
    return CarRepository.cars;
  }

  public Car findById(int id) {
    for (Car car : cars) {
      if (car.getId() == id) {
        return car;
      }
    }

    return null;
  }

  public boolean removeById(int id) {
    return CarRepository.cars.removeIf(car -> car.getId() == id);
  }

  public Car create(
    String brand,
    String model,
    int releaseYear,
    String color,
    int registrationNumber,
    int price
  ) {
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

  private static ArrayList<Car> cars = new ArrayList<Car>();
  private static int lastId = 1;
}
