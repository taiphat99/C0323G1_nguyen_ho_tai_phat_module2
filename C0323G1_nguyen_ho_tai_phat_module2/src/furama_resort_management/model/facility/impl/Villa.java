package furama_resort_management.model.facility.impl;

import furama_resort_management.model.facility.Facility;

public class Villa extends Facility {
    private String villaStandard;
    private float poolArea;
    private int numberOfFloor;

    public Villa(String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String villaStandard, float poolArea, int numberOfFloor) {
        super(serviceCode, serviceName, area, rate, maximumNumberOfPeople, typeOfRent);
        this.villaStandard = villaStandard;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String getServiceCode() {
        return super.getServiceCode();
    }

    @Override
    public void setServiceCode(String serviceCode) {
        super.setServiceCode(serviceCode);
    }

    @Override
    public String getServiceName() {
        return super.getServiceName();
    }

    @Override
    public void setServiceName(String serviceName) {
        super.setServiceName(serviceName);
    }

    @Override
    public float getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(float area) {
        super.setArea(area);
    }

    @Override
    public float getRate() {
        return super.getRate();
    }

    @Override
    public void setRate(float rate) {
        super.setRate(rate);
    }

    @Override
    public int getMaximumNumberOfPeople() {
        return super.getMaximumNumberOfPeople();
    }

    @Override
    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        super.setMaximumNumberOfPeople(maximumNumberOfPeople);
    }

    @Override
    public String getTypeOfRent() {
        return super.getTypeOfRent();
    }

    @Override
    public void setTypeOfRent(String typeOfRent) {
        super.setTypeOfRent(typeOfRent);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                ", Villa Standard = " + villaStandard +
                ", pool Area = " + poolArea +
                ", Number Of Floor = " + numberOfFloor;
    }
}
