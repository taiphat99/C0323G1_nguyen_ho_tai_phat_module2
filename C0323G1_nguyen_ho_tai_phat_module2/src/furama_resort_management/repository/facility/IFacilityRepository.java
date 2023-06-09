package furama_resort_management.repository.facility;

import furama_resort_management.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> getData();
    void add(Facility facility);
    Facility findById(String id);
    void remove(Facility facility);

    void valueOfFacilityPlusOne(String facilityId);
}
