package Model.model.Facility;

public class VillaFacility extends Facility {
    public String levelVillaFacility;
    public String areaPoolVilla;
    public String numberFloors;

    public VillaFacility(String id, String nameFacility, String areaFacility, String quantityPeople, String rentalType, String levelVillaFacility, String areaPoolVilla, String numberFloors, String numbOfFloor) {
        super(id, nameFacility, areaFacility, quantityPeople, rentalType);
        this.levelVillaFacility = levelVillaFacility;
        this.areaPoolVilla = areaPoolVilla;
        this.numberFloors = numberFloors;
    }

    public VillaFacility() {
    }

    public VillaFacility(int id, String nameFacility, String area, String numberPeople, String rentalType, String combofurama) {
    }

    public String getLevelVillaFacility() {
        return levelVillaFacility;
    }

    public void setLevelVillaFacility(String levelVillaFacility) {
        this.levelVillaFacility = levelVillaFacility;
    }

    public String getAreaPoolVilla() {
        return areaPoolVilla;
    }

    public void setAreaPoolVilla(String areaPoolVilla) {
        this.areaPoolVilla = areaPoolVilla;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "VillaFacility{" +
                "levelVillaFacility='" + levelVillaFacility + '\'' +
                ", areaPoolVilla='" + areaPoolVilla + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                ", id=" + id +
                ", nameFacility='" + nameFacility + '\'' +
                ", areaFacility='" + areaFacility + '\'' +
                ", quantityPeople=" + quantityPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
