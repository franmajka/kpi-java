package helper;

import java.util.concurrent.ThreadLocalRandom;

public class CarHelper {
  static public String randStr(String[] arr) {
    return arr[( ThreadLocalRandom.current().nextInt(0, arr.length))];
  }

  static public int randInt(int from, int to) {
    return ( ThreadLocalRandom.current().nextInt(from, to + 1));
  }
}
