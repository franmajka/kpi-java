import repository.CarRepository;
import service.CarService;


public class Main {
  public static void main(String[] args) {
    CarRepository carRepository = new CarRepository();
    CarService carService = new CarService(carRepository);

    carService.createCarPool(30);

    carService.getAll().forEach(System.out::println);

    System.out.println("\nCars made by Kia:");
    carService.findByBrand("Kia").forEach(System.out::println);

    System.out.println("\nCars of model K6 that have been used for more than 1 years:");
    carService.findByModelAndOlderThan("K6", 1).forEach(System.out::println);

    System.out.println("\nCars issued in 2005 that are more expensive than 3500:");
    carService.findByYearAndMoreExpensiveThan(2005, 3500).forEach(System.out::println);
  }
}
