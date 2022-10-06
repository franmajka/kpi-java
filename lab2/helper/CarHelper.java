package helper;

import java.util.concurrent.ThreadLocalRandom;

public class CarHelper {

  public static String getRandModel() {
    return arrModel[( ThreadLocalRandom.current().nextInt(0, arrModel.length))];
  }

  public static String getRandBrand() {
    return arrBrand[( ThreadLocalRandom.current().nextInt(0, arrBrand.length))];
  }

  public static String getRandColor() {
    return arrColor[( ThreadLocalRandom.current().nextInt(0, arrColor.length))];
  }

  public static int getRandInt(int from, int to) {
    return ( ThreadLocalRandom.current().nextInt(from, to + 1));
  }

  private static String[] arrModel = { "LX5", "V4", "SQ1", "K6", "HU66", "I1" };
  private static String[] arrBrand = { "Honda", "GMC", "Chrysler", "Kia", "Toyota", "Nissan" };
  private static String[] arrColor = { "black", "red", "green", "yellow", "white", "pink" };
}
