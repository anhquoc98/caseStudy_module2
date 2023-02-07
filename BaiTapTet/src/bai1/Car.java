package bai1;

public class Car {
    private String nameCar;
    private int dungTichl;
    private String giaTriXe;
    private double thueXe;

    public Car(String nameCar, int dungTichl, String giaTriXe, double thueXe) {
        this.nameCar = nameCar;
        this.dungTichl = dungTichl;
        this.giaTriXe = giaTriXe;
        this.thueXe = thueXe;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getDungTichl() {
        return dungTichl;
    }

    public void setDungTichl(int dungTichl) {
        this.dungTichl = dungTichl;
    }

    public String getGiaTriXe() {
        return giaTriXe;
    }

    public void setGiaTriXe(String giaTriXe) {
        this.giaTriXe = giaTriXe;
    }

    public double getThueXe() {
        return thueXe;
    }

    public void setThueXe(double thueXe) {
        this.thueXe = thueXe;
    }

    @Override
    public String toString() {
        return "modol{" +
                "nameCar='" + nameCar + '\'' +
                ", dungTichl=" + dungTichl +
                ", giaTriXe='" + giaTriXe + '\'' +
                ", thueXe=" + thueXe +
                '}';
    }
}
