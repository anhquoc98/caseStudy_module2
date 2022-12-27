package Model.model.Facility;

public class Facility {
    public String nameFacility;
    public String areaFacility;
    public int quantityPeople;
    public String rentalType;

    public Facility(String nameFacility, String areaFacility, int quantityPeople, String rentalType) {
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

    public int getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(int quantityPeople) {
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
                "nameFacility='" + nameFacility + '\'' +
                ", areaFacility='" + areaFacility + '\'' +
                ", quantityPeople=" + quantityPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
