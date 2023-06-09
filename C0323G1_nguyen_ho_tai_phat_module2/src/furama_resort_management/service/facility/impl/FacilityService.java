package furama_resort_management.service.facility.impl;

import furama_resort_management.model.facility.Facility;
import furama_resort_management.model.facility.impl.House;
import furama_resort_management.model.facility.impl.Room;
import furama_resort_management.model.facility.impl.Villa;
import furama_resort_management.repository.facility.impl.FacilityRepository;
import furama_resort_management.service.facility.IFacilityService;
import furama_resort_management.utils.regex.Regex;

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
                loop2:
                do {
                    System.out.println("Are you sure to remove this object!\n" +
                            "1. Yes\n" +
                            "2. No\n" +
                            "Enter here: ");
                    int confirmOption;
                    try {
                        confirmOption = Integer.parseInt(sc.nextLine());
                        switch (confirmOption) {
                            case 1:
                                facilityRepository.remove(facility);
                                System.out.println("Remove successfully!");
                                break loop2;
                            case 2:
                                break loop2;
                        }
                    } catch (NumberFormatException n) {
                        System.err.println("Format Error!");
                    }
                } while (true);
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
        loop1:
        do {
            System.out.println("What kind of facility you would like to add \n" +
                    "1. Villa \n" +
                    "2. House \n" +
                    "3. Room\n" +
                    "Enter here: ");
            int addingOption;
            try {
                addingOption = Integer.parseInt(sc.nextLine());
                switch (addingOption) {
                    case 1:
//String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String villaStandard, float poolArea, int numberOfFloor
                        System.out.println("Enter ID: ");
                        String villaServiceCode = sc.nextLine();
                        if (facilityRepository.findById(villaServiceCode) != null) {
                            System.out.println("This ID exists already!");
                        } else {
                            do {
                                if (Regex.validate(villaServiceCode, Regex.VILLA_CODE_REGEX)) {

                                    String serviceName;
                                    do {
                                        System.out.println("Enter Name of Service: ");
                                        serviceName = sc.nextLine();
                                        if (Regex.validate(serviceName, Regex.SERVICE_NAME_REGEX)) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Name!");
                                        }
                                    } while (true);

                                    float area;
                                    do {
                                        System.out.println("Enter area: ");
                                        try {
                                            area = Float.parseFloat(sc.nextLine());
                                            if (area >= 30) {
                                                break;
                                            } else {
                                                System.out.println("Invalid Area!");
                                            }
                                        } catch (NumberFormatException n) {
                                            System.err.println("Format Error!");
                                        }
                                    } while (true);

                                    float rate;
                                    do {
                                        System.out.println("Enter rate: ");
                                        try {
                                            rate = Float.parseFloat(sc.nextLine());
                                            if (rate > 0) {
                                                break;
                                            } else {
                                                System.out.println("Invalid Rate!");
                                            }
                                        } catch (NumberFormatException n) {
                                            System.err.println("Format Error!");
                                        }
                                    } while (true);

                                    int maximumNumberOfPeople;
                                    do {
                                        System.out.println("Enter the maximum People contain: ");
                                        try {
                                            maximumNumberOfPeople = Integer.parseInt(sc.nextLine());
                                            if (maximumNumberOfPeople > 0 && maximumNumberOfPeople < 20) {
                                                break;
                                            } else {
                                                System.out.println("Invalid number!");
                                            }
                                        } catch (NumberFormatException n) {
                                            System.err.println("Format Error!");
                                        }
                                    } while (true);

                                    String typeOfRent;
                                    do {
                                        System.out.println("Enter type of Rent: ");
                                        typeOfRent = sc.nextLine();
                                        if (Regex.validate(typeOfRent, Regex.SERVICE_NAME_REGEX)) {
                                            break;
                                        } else {
                                            System.err.println("Invalid Type!");
                                        }
                                    } while (true);

                                    String villaStandard;
                                    do {
                                        System.out.println("Enter Villa Standard: ");
                                        villaStandard = sc.nextLine();
                                        if (Regex.validate(villaStandard, Regex.SERVICE_NAME_REGEX)) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Standard!");
                                        }
                                    } while (true);

                                    float poolArea;
                                    do {
                                        System.out.println("Enter pool Area: ");
                                        try {
                                            poolArea = Float.parseFloat(sc.nextLine());
                                            if (poolArea > 30) {
                                                break;
                                            } else {
                                                System.out.println("Invalid pool area!");
                                            }
                                        } catch (NumberFormatException n) {
                                            System.err.println("Format Error!");
                                        }
                                    } while (true);

                                    int numberOfFloor;
                                    do {
                                        System.out.println("Enter the number of Floor: ");
                                        try {
                                            numberOfFloor = Integer.parseInt(sc.nextLine());
                                            if (numberOfFloor > 0) {
                                                break;
                                            } else {
                                                System.out.println("Invalid number!");
                                            }
                                        } catch (NumberFormatException n) {
                                            System.err.println("Format Error!");
                                        }
                                    } while (true);
                                    Facility facility = new Villa(villaServiceCode, serviceName, area, rate, maximumNumberOfPeople, typeOfRent, villaStandard, poolArea, numberOfFloor);
                                    facilityRepository.add(facility);
                                    System.out.println("Add successfully!");
                                    break loop1;
                                } else {
                                    System.out.println("Invalid Code!");
                                }
                            } while (true);

                        }
                    case 2:
//String serviceCode, String serviceName, float area, float rate, int maximumNumberOfPeople, String typeOfRent, String houseStandard, int numberOfFloor
                        System.out.println("Enter ID: ");
                        String houseServiceCode = sc.nextLine();
                        if (facilityRepository.findById(houseServiceCode) != null) {
                            System.out.println("This ID exists already!");
                        } else {
                            if (Regex.validate(houseServiceCode, Regex.HOUSE_CODE_REGEX)) {
                                String serviceHouseName;
                                do {
                                    System.out.println("Enter Name of Service: ");
                                    serviceHouseName = sc.nextLine();
                                    if (Regex.validate(serviceHouseName, Regex.SERVICE_NAME_REGEX)) {
                                        break;
                                    } else {
                                        System.out.println("Invalid Name!");
                                    }
                                } while (true);

                                float houseArea;
                                do {
                                    System.out.println("Enter area: ");
                                    try {
                                        houseArea = Float.parseFloat(sc.nextLine());
                                        if (houseArea >= 30) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Area!");
                                        }
                                    } catch (NumberFormatException n) {
                                        System.err.println("Format Error!");
                                    }
                                } while (true);

                                float houseRate;
                                do {
                                    System.out.println("Enter rate: ");
                                    try {
                                        houseRate = Float.parseFloat(sc.nextLine());
                                        if (houseRate > 0) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Rate!");
                                        }
                                    } catch (NumberFormatException n) {
                                        System.err.println("Format Error!");
                                    }
                                } while (true);

                                int houseMaximumNumberOfPeople;
                                do {
                                    System.out.println("Enter the maximum People contain: ");
                                    try {
                                        houseMaximumNumberOfPeople = Integer.parseInt(sc.nextLine());
                                        if (houseMaximumNumberOfPeople > 0 && houseMaximumNumberOfPeople < 20) {
                                            break;
                                        } else {
                                            System.out.println("Invalid number!");
                                        }
                                    } catch (NumberFormatException n) {
                                        System.err.println("Format Error!");
                                    }
                                } while (true);

                                String houseTypeOfRent;
                                do {
                                    System.out.println("Enter type of Rent: ");
                                    houseTypeOfRent = sc.nextLine();
                                    if (Regex.validate(houseTypeOfRent, Regex.SERVICE_NAME_REGEX)) {
                                        break;
                                    } else {
                                        System.err.println("Invalid Type!");
                                    }
                                } while (true);

                                String houseStandard;
                                do {
                                    System.out.println("Enter House Standard: ");
                                    houseStandard = sc.nextLine();
                                    if (Regex.validate(houseStandard, Regex.SERVICE_NAME_REGEX)) {
                                        break;
                                    } else {
                                        System.out.println("Format Error!");
                                    }
                                } while (true);

                                int houseNumberOfFloor;
                                do {
                                    System.out.println("Enter Number of Floor: ");
                                    try {
                                        houseNumberOfFloor = Integer.parseInt(sc.nextLine());
                                        if (houseNumberOfFloor > 0) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Floor!");
                                        }
                                    } catch (NumberFormatException n) {
                                        System.err.println("Format Error!");
                                    }
                                } while (true);
                                Facility facility1 = new House(houseServiceCode, serviceHouseName, houseArea, houseRate, houseMaximumNumberOfPeople, houseTypeOfRent, houseStandard, houseNumberOfFloor);
                                facilityRepository.add(facility1);
                                System.out.println("Add successfully!");
                                break loop1;

                            } else {
                                System.out.println("Invalid Code!");
                            }
                        }

                    case 3:
                        System.out.println("Enter ID: ");
                        String roomServiceCode = sc.nextLine();
                        if (facilityRepository.findById(roomServiceCode) != null) {
                            System.out.println("This ID exists already!");
                        } else {
                            if (Regex.validate(roomServiceCode, Regex.ROOM_CODE_REGEX)) {

                                String roomServiceName;
                                do {
                                    System.out.println("Enter Name of Service: ");
                                    roomServiceName = sc.nextLine();
                                    if (Regex.validate(roomServiceName, Regex.SERVICE_NAME_REGEX)) {
                                        break;
                                    } else {
                                        System.out.println("Invalid Name!");
                                    }
                                } while (true);

                                float roomArea;
                                do {
                                    System.out.println("Enter area: ");
                                    try {
                                        roomArea = Float.parseFloat(sc.nextLine());
                                        if (roomArea >= 30) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Area!");
                                        }
                                    } catch (NumberFormatException n) {
                                        System.err.println("Format Error!");
                                    }
                                } while (true);

                                float roomRate;
                                do {
                                    System.out.println("Enter rate: ");
                                    try {
                                        roomRate = Float.parseFloat(sc.nextLine());
                                        if (roomRate > 0) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Rate!");
                                        }
                                    } catch (NumberFormatException n) {
                                        System.err.println("Format Error!");
                                    }
                                } while (true);

                                int roomMaximumNumberOfPeople;
                                do {
                                    System.out.println("Enter the maximum People contain: ");
                                    try {
                                        roomMaximumNumberOfPeople = Integer.parseInt(sc.nextLine());
                                        if (roomMaximumNumberOfPeople > 0 && roomMaximumNumberOfPeople < 20) {
                                            break;
                                        } else {
                                            System.out.println("Invalid number!");
                                        }
                                    } catch (NumberFormatException n) {
                                        System.err.println("Format Error!");
                                    }
                                } while (true);

                                String roomTypeOfRent;
                                do {
                                    System.out.println("Enter type of Rent: ");
                                    roomTypeOfRent = sc.nextLine();
                                    if (Regex.validate(roomTypeOfRent, Regex.SERVICE_NAME_REGEX)) {
                                        break;
                                    } else {
                                        System.err.println("Invalid Type!");
                                    }
                                } while (true);

                                String freeService;
                                do {
                                    System.out.println("Enter free service: ");
                                    freeService = sc.nextLine();
                                    if (Regex.validate(freeService, Regex.SERVICE_NAME_REGEX)) {
                                        break;
                                    } else {
                                        System.out.println("Invalid Service!");
                                    }
                                } while (true);
                                Facility facility2 = new Room(roomServiceCode, roomServiceName, roomArea, roomRate, roomMaximumNumberOfPeople, roomTypeOfRent, freeService);
                                facilityRepository.add(facility2);
                                System.out.println("Add successfully!");
                                break loop1;

                            } else {
                                System.out.println("Invalid Code!");
                            }
                        }
                    default:
                        break;
                }
            } catch (NumberFormatException n) {
                System.err.println("Format Error!");
            }
        } while (true);
    }
}
