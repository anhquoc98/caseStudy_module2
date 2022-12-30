package Model.model.Facility;

public class RoomFacility extends Facility{
    public String freeService;

    public RoomFacility(String serviceName, String usableArea, String rentalCost, String maxiumNumbOfPeople, String rentalType, String serviceCode, String freeServiceIncluded) {
    }

    public RoomFacility(String id, String nameFacility, String areaFacility, String quantityPeople, String rentalType, String freeService) {
        super(id, nameFacility, areaFacility, quantityPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "RoomFacility{" +
                "freeService='" + freeService + '\'' +
                ", nameFacility='" + nameFacility + '\'' +
                ", areaFacility='" + areaFacility + '\'' +
                ", quantityPeople=" + quantityPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
