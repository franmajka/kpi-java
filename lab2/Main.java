import model.Car;
import repository.CarRepository;
import service.CarService;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    CarRepository carRepository = new CarRepository();
    CarService carService = new CarService(carRepository);

    carService.createCarPool(10);

    // get all cars
    ArrayList<Car> cars = carService.getAll();
    for (Car car: cars) {
      car.printCar();
    }

    System.out.println("\nCars made by Kia:");
    carService.findByBrand("Kia").forEach(System.out::println);

    System.out.println("\nCars of model K6 that have been used for more than 1 years:");
    carService.findByModelAndOlderThan("K6", 1).forEach(System.out::println);

    System.out.println("\nCars issued in 2005 that are more expensive than 3500:");
    carService.findByYearAndMoreExpensiveThan(2005, 3500).forEach(System.out::println);
  }
}
