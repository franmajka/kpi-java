import helper.CarHelper;
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

    System.out.println("\n-----------------------------");
    System.out.println("\nCars made by Kia:");
    for (Car car : carService.findByBrand("Kia")) {
      car.printCar();
    }

    System.out.println("\n-----------------------------");
    System.out.println("\nCars made by Kia that have been used for more than 2 years:");
    int hUsage = 2;
    for (Car car : carService.listBrandedCarsOlderThan("Kia", hUsage)) {
      car.printCar();
    }

    System.out.println("\n-----------------------------");
    System.out.println("\nCars made in 2005 that are more expensive than $4000:");
    int year = 2005;
    int price = 4000;
    for (Car car : carService.listCarsMoreExpensiveThanWithSpecifiedReleaseYear(year, price)) {
      car.printCar();
    }

  }
}
