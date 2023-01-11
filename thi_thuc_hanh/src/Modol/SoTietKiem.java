package Modol;

public class SoTietKiem {
    private int maSoTietKiem;
    private String soTaiKhoan;
    private String nameKhachHang;
    private int soTien;
   private String soThang;
   private double laiXuat;

    public SoTietKiem() {
    }

    public SoTietKiem(int maSoTietKiem, String soTaiKhoan, String nameKhachHang, int soTien, String soThang, double laiXuat) {
        this.maSoTietKiem = maSoTietKiem;
        this.soTaiKhoan = soTaiKhoan;
        this.nameKhachHang = nameKhachHang;
        this.soTien = soTien;
        this.soThang = soThang;
        this.laiXuat = laiXuat;
    }

    public int getMaSoTietKiem() {
        return maSoTietKiem;
    }

    public void setMaSoTietKiem(int maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getNameKhachHang() {
        return nameKhachHang;
    }

    public void setNameKhachHang(String nameKhachHang) {
        this.nameKhachHang = nameKhachHang;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public String getSoThang() {
        return soThang;
    }

    public void setSoThang(String soThang) {
        this.soThang = soThang;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    @Override
    public String toString() {
        return "SoTietKiem{" +
                "maSoTietKiem=" + maSoTietKiem +
                ", soTaiKhoan='" + soTaiKhoan + '\'' +
                ", nameKhachHang='" + nameKhachHang + '\'' +
                ", soTien=" + soTien +
                ", soThang='" + soThang + '\'' +
                ", laiXuat=" + laiXuat +
                '}';
    }
    public String toStringCSV(){
        final String COMMA =",";
        return this.maSoTietKiem+COMMA+this.soTaiKhoan+COMMA+this.nameKhachHang+COMMA+this.soTien+
                COMMA+this.soThang+COMMA+this.laiXuat;
    }
}
