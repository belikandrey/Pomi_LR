package by.bsuir.task1_4;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

public class House {
    private BigInteger id;
    private String flatNumber;
    private Double square;
    private int floor;
    private int numRooms;
    private String street;
    private String buildingType;
    private long lifetime;

    public House(BigInteger id, String flatNumber, Double square, int floor, int numRooms, String street, String buildingType, long lifetime) {
        this.id = id;
        this.flatNumber = flatNumber;
        this.square = square;
        this.floor = floor;
        this.numRooms = numRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.lifetime = lifetime;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public long getLifetime() {
        return lifetime;
    }

    public void setLifetime(long lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floor == house.floor && numRooms == house.numRooms && lifetime == house.lifetime && Objects.equals(id, house.id) && Objects.equals(flatNumber, house.flatNumber) && Objects.equals(square, house.square) && Objects.equals(street, house.street) && Objects.equals(buildingType, house.buildingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flatNumber, square, floor, numRooms, street, buildingType, lifetime);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", flatNumber='" + flatNumber + '\'' +
                ", square=" + square +
                ", floor=" + floor +
                ", numRooms=" + numRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", lifetime=" + lifetime +
                '}';
    }
}
