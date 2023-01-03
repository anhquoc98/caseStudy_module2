package Model.model.Facility;

public class VillaFacility extends Facility {
    private String moneyVilla;
    private String levelVillaFacility;
    private String areaPoolVilla;
    private String numberFloors;

    public VillaFacility(String id, String nameFacility, String areaFacility, String quantityPeople, String rentalType,
                         String moneyVilla, String levelVillaFacility, String areaPoolVilla, String numberFloors) {
        super(id, nameFacility, areaFacility, quantityPeople, rentalType);
        this.moneyVilla = moneyVilla;
        this.levelVillaFacility = levelVillaFacility;
        this.areaPoolVilla = areaPoolVilla;
        this.numberFloors = numberFloors;
    }

    public VillaFacility(String moneyVilla, String levelVillaFacility, String areaPoolVilla, String numberFloors) {
        this.moneyVilla = moneyVilla;
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
                super.toString();
    }
    public String coverToCSV(){
        final String COMMA=",";
        return super.coverToCSV()+COMMA+this.moneyVilla+COMMA+this.levelVillaFacility+COMMA+this.areaPoolVilla+COMMA+this.numberFloors;
    }
}
