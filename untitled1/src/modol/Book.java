package modol;

public class Book {
    String maSach;
    String tenSach;
    String loaiSach;
    int soLanSuDung;

    public Book(String maSach, String tenSach, String loaiSach, int soLanSuDung) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.loaiSach = loaiSach;
        this.soLanSuDung = soLanSuDung;
    }

    public Book() {
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public int getSoLanSuDung() {
        return soLanSuDung;
    }

    public void setSoLanSuDung(int soLanSuDung) {
        this.soLanSuDung = soLanSuDung;
    }

    @Override
    public String toString() {
        return "Book{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", loaiSach='" + loaiSach + '\'' +
                ", soLanSuDung=" + soLanSuDung +
                '}';
    }
    public String toStringCSV(){
        final String COMMA=",";
        return this.maSach+COMMA+this.tenSach+COMMA+this.loaiSach+COMMA+this.soLanSuDung;
    }
}
