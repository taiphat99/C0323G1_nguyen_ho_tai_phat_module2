package furama_resort_management.repository.facility.impl;

import furama_resort_management.model.facility.Facility;
import furama_resort_management.model.facility.impl.House;
import furama_resort_management.model.facility.impl.Room;
import furama_resort_management.model.facility.impl.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository {


    private static Map<Facility, Integer> dataLinkedHashMap = new LinkedHashMap<>();


    static {
        //String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String villaStandard, float poolArea, int numberOfFloor
        dataLinkedHashMap.put(new Villa("SVVL-1234","Villa Rent1",57f,5500000,6,"Day","Medium",25,2),3);
        dataLinkedHashMap.put(new Villa("SVVL-1111", "Villa Rent2", 50f, 5000000f, 8, "Day", "Normal", 20f, 2), 2);
        //String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String houseStandard, int numberOfFloor
        dataLinkedHashMap.put(new House("SVHO-2222", "House Rent1", 50f, 4000000f, 5, "Day", "Normal", 1), 3);
        dataLinkedHashMap.put(new House("SVHO-1324","House Rent2",44f,4200000f,4,"Week","Good", 1),4);
        //String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String freeService
        dataLinkedHashMap.put(new Room("SVRO-3333", "Room Rent1", 35f, 3500000f, 2, "Day", "Water"), 5);
        dataLinkedHashMap.put(new Room("SVRO-5434", "Room Rent2",34f,3500000,2,"Month","Fruit"),3);
    }

    public Map<Facility, Integer> getData() {
        return dataLinkedHashMap;
    }

    public void add(Facility facility) {
        dataLinkedHashMap.put(facility, 0);
    }


    public Facility findById(String id) {
        for (Facility facility : dataLinkedHashMap.keySet()) {
            if (facility.getServiceCode().equals(id)) {
                return facility;
            }
        }
        return null;
    }

    public void remove(Facility facility) {
        dataLinkedHashMap.remove(facility);
    }

    public void displayMaintenance() {

    }


}
