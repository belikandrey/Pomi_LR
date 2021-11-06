package by.bsuir.task1_6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class Car {
    private BigInteger id;
    private String brand;
    private String model;
    private int yearIssue;
    private String color;
    private BigDecimal price;
    private String number;

    public Car(BigInteger id, String brand, String model, int yearIssue, String color, BigDecimal price, String number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearIssue = yearIssue;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearIssue == car.yearIssue && Objects.equals(id, car.id) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(price, car.price) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, yearIssue, color, price, number);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearIssue=" + yearIssue +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }
}
