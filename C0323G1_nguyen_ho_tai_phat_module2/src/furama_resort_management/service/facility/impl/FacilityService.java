package furama_resort_management.service.facility.impl;

import furama_resort_management.model.facility.Facility;
import furama_resort_management.repository.facility.impl.FacilityRepository;
import furama_resort_management.service.facility.IFacilityService;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final Scanner sc = new Scanner(System.in);
    private static final FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void remove() {
        System.out.println("Enter ID you would like to delete: ");
        try {
            String id = sc.nextLine();
            Facility facility = facilityRepository.findById(id);
            if (facility == null) {
                System.out.println("This ID doesn't exist!");
            } else {
                facilityRepository.remove(facility);
            }
        } catch (Exception e) {
            System.err.println("Error!");
        }
    }

    @Override
    public void displayMaintenance() {
        Map<Facility, Integer> data = facilityRepository.getData();
        for (Facility facility : data.keySet()) {
            if (data.get(facility) >= 5) {
                System.out.println(facility);
            }
        }
    }

    public void display() {
        Map<Facility, Integer> data = facilityRepository.getData();
        for (Facility facility : data.keySet()) {
            System.out.println(facility + " | " + data.get(facility) + " times");
        }
    }

    public void add() {

    }
}
