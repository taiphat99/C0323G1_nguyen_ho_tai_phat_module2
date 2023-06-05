package furama_resort_management.model.facility.impl;

import furama_resort_management.model.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String freeService) {
        super(serviceCode, serviceName, area, rate, maximumNumberOfPeople, typeOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
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
        return "Room: " + super.toString() +
                ", free Service = " + freeService;
    }
}
