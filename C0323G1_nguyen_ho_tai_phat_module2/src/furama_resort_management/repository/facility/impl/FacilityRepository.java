package furama_resort_management.repository.facility.impl;

import furama_resort_management.model.facility.Facility;
import furama_resort_management.model.facility.impl.House;
import furama_resort_management.model.facility.impl.Room;
import furama_resort_management.model.facility.impl.Villa;
import furama_resort_management.repository.facility.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {


    private static final Map<Facility, Integer> dataLinkedHashMap = new LinkedHashMap<>();


    static {
        //String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String villaStandard, float poolArea, int numberOfFloor
        dataLinkedHashMap.put(new Villa("SVVL-1234", "Villa Rent1", 57f, 5500000, 6, "Day", "Medium", 32, 2), 4);
        dataLinkedHashMap.put(new Villa("SVVL-1111", "Villa Rent2", 50f, 5000000f, 8, "Day", "Normal", 34f, 2), 2);
        //String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String houseStandard, int numberOfFloor
        dataLinkedHashMap.put(new House("SVHO-2222", "House Rent1", 50f, 4000000f, 5, "Day", "Normal", 1), 5);
        dataLinkedHashMap.put(new House("SVHO-1324", "House Rent2", 44f, 4200000f, 4, "Week", "Good", 1), 4);
        //String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String freeService
        dataLinkedHashMap.put(new Room("SVRO-3333", "Room Rent1", 35f, 3500000f, 2, "Day", "Water"), 5);
        dataLinkedHashMap.put(new Room("SVRO-5434", "Room Rent2", 34f, 3500000, 2, "Month", "Fruit"), 2);
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

    @Override
    public void valueOfFacilityPlusOne(String facilityId) {
        for (Facility facility1 : dataLinkedHashMap.keySet()) {
            if (facility1.getServiceCode().equals(facilityId)) {
                Integer value = dataLinkedHashMap.get(facility1);
                value++;
                dataLinkedHashMap.put(facility1, value);
                break;
            }

        }
    }

}
