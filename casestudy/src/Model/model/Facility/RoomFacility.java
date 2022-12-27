package Model.model.Facility;

public class RoomFacility extends Facility{
    public String freeService;

    public RoomFacility() {
    }

    public RoomFacility(String nameFacility, String areaFacility, int quantityPeople, String rentalType, String freeService) {
        super(nameFacility, areaFacility, quantityPeople, rentalType);
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
