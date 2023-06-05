package furama_resort_management.model.facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private float area;
    private float rate;
    private int maximumNumberOfPeople;
    private String typeOfRent;

    public Facility(String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.rate = rate;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.typeOfRent = typeOfRent;

    }
    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode);
    }

    @Override
    public String toString() {
        return "Code = " + serviceCode +
                ", Service Name = " + serviceName +
                ", Area = " + area +
                ", Rate = " + rate +
                ", Maximum Number Of People = " + maximumNumberOfPeople +
                ", Type Of Rent = " + typeOfRent;
    }
}
