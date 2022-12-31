package Model.model.Facility;

public class Facility {
    public String id;
    public String nameFacility;
    public String areaFacility;
    public String quantityPeople;
    public String rentalType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Facility(String id, String nameFacility, String areaFacility, String quantityPeople, String rentalType) {
        this.id = id;
        this.nameFacility = nameFacility;
        this.areaFacility = areaFacility;
        this.quantityPeople = quantityPeople;
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public String getAreaFacility() {
        return areaFacility;
    }

    public void setAreaFacility(String areaFacility) {
        this.areaFacility = areaFacility;
    }

    public String getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(String quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", nameFacility='" + nameFacility + '\'' +
                ", areaFacility='" + areaFacility + '\'' +
                ", quantityPeople=" + quantityPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String coverToCSV() {
        final String COMMA = ",";
        return this.nameFacility + COMMA + this.areaFacility + COMMA + this.quantityPeople + COMMA + this.rentalType + COMMA + this.id;
    }
}
