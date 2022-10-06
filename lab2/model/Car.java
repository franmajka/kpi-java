package model;

public class Car {
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getReleaseYear() {
    return this.releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getRegistrationNumber() {
    return this.registrationNumber;
  }

  public void setRegistrationNumber(int registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String toString() {
    return String.format(
      "Car {\tid: %d,\tbrand: %s,\tmodel: %s,\treleaseYear: %d,\tcolor: %s,\tregistrationNumber: %d,\tprice: %d\t}",
      id,
      brand,
      model,
      releaseYear,
      color,
      registrationNumber,
      price
    );
  }

  private int id;
  private String brand;
  private String model;
  private int releaseYear;
  private String color;
  private int registrationNumber;
  private int price;
}
