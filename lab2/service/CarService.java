package service;

import model.Car;
import helper.CarHelper;
import repository.CarRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.stream.Collectors;

public class CarService {
  public CarService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public void createCarPool(int poolSize) {

    for (int i = 0; i < poolSize; i++) {
      this.carRepository.create(
              CarHelper.getRandBrand(),
              CarHelper.getRandModel(),
              CarHelper.getRandInt(2000, 2022),
              CarHelper.getRandColor(),
              CarHelper.getRandInt(0, 10000000),
              CarHelper.getRandInt(0, 10000)
      );
    }
  }

  public ArrayList<Car> findByBrand(String brand) {
    return this.carRepository
      .getAll()
      .stream()
      .filter(car -> car.getBrand().equals(brand))
      .collect(Collectors.toCollection(ArrayList::new));
  }

  public ArrayList<Car> listBrandedCarsOlderThan(String brand, int age) {
    ArrayList<Car> carsOfSpecifiedBrand = findByBrand(brand);
    ArrayList<Car> intersection = new ArrayList<Car>();

    for (Car car : carsOfSpecifiedBrand) {
      if (Calendar.getInstance().get(Calendar.YEAR) - car.getReleaseYear() >= age) {
        intersection.add(car);
      }
    }
    return intersection;
  }

  public ArrayList<Car> listCarsMoreExpensiveThanWithSpecifiedReleaseYear(int releaseYear, int price) {
    return this.carRepository
      .getAll()
      .stream()
      .filter(car ->
        car.getReleaseYear().equals(releaseYear) &&
        car.getPrice() > price
      )
      .collect(Collectors.toCollection(ArrayList::new));
  }

  public ArrayList<Car> getAll() {
    return this.carRepository.getAll();
  }

    private CarRepository carRepository;
}