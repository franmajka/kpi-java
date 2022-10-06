package model;

public class Car {

  public void printCar() {
    System.out.printf(
            "Car { id: %d, brand: %s, model: %s, releaseYear: %d, color: %s, registrationNumber: %d, price: %d }%n",
            this.id,
            this.brand,
            this.model,
            this.releaseYear,
            this.color,
            this.registrationNumber,
            this.price
    );
  }

  public Integer getId()
  {
    return this.id;
  }

  public String getBrand()
  {
    return this.brand;
  }

  public String getModel()
  {
    return this.model;
  }

  public Integer getReleaseYear()
  {
    return this.releaseYear;
  }

  public String getColor()
  {
    return this.color;
  }

  public Integer getRegistrationNumber()
  {
    return this.registrationNumber;
  }

  public Integer getPrice()
  {
    return this.price;
  }



  public void setId(Integer id)
  {
    this.id = id;
  }

  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public void setReleaseYear(Integer releaseYear)
  {
    this.releaseYear = releaseYear;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setRegistrationNumber(Integer registrationNumber)
  {
    this.registrationNumber = registrationNumber;
  }

  public void setPrice(Integer price)
  {
    this.price = price;
  }

  private Integer id;
  private String brand;
  private String model;
  private Integer releaseYear;
  private String color;
  private Integer registrationNumber;
  private Integer price;
}