package service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.stream.Collectors;

import helper.CarHelper;
import model.Car;
import repository.CarRepository;

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
      .findAll()
      .stream()
      .filter(car -> car.getBrand().equals(brand))
      .collect(Collectors.toCollection(ArrayList::new));
  }

  public ArrayList<Car> findByModelAndOlderThan(String model, int yearsOfExploitations) {
    return this.carRepository
      .findAll()
      .stream()
      .filter(car ->
        car.getModel().equals(model) &&
        Calendar.getInstance().get(Calendar.YEAR) - car.getReleaseYear() >= yearsOfExploitations
      )
      .collect(Collectors.toCollection(ArrayList::new));
  }

  public ArrayList<Car> findByYearAndMoreExpensiveThan(int year, int price) {
    return this.carRepository
      .findAll()
      .stream()
      .filter(car -> car.getReleaseYear() == year && car.getPrice() > price)
      .collect(Collectors.toCollection(ArrayList::new));
  }

  public ArrayList<Car> getAll() {
    return this.carRepository.findAll();
  }


  private final CarRepository carRepository;
}
