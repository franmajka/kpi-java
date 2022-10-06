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

  public Car createRandomCar() {
    return this.carRepository.create(
      CarHelper.randStr(arrBrand),
      CarHelper.randStr(arrModel),
      CarHelper.randInt(2000, 2022),
      CarHelper.randStr(arrColor),
      CarHelper.randInt(0, 800000),
      CarHelper.randInt(0, 10000)
    );
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



  private CarRepository carRepository;

  private static String[] arrModel = { "LX5", "V4", "SQ1", "K6", "HU66", "I1" };
  private static String[] arrBrand = { "Honda", "GMC", "BMV", "Kia", "Toyota", "Nissan" };
  private static String[] arrColor = { "black", "red", "green", "yellow", "white", "pink" };
}
