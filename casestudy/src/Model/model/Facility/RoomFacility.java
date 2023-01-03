package Model.model.Facility;

public class RoomFacility extends Facility{
    private String freeService;

    public RoomFacility( String nameFacility, String areaFacility, String quantityPeople, String rentalType,String id, String freeService) {
        super(id, nameFacility, areaFacility, quantityPeople, rentalType);
        this.freeService = freeService;
    }

    public RoomFacility() {
    }

    public RoomFacility(String freeService) {
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
        return "RoomFacility{" +super.toString()+'\''+
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String coverToCSV(){
        final String COMMA=",";
        return super.coverToCSV()+COMMA+this.freeService;
    }
}
