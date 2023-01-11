package modol;

public class CongDan {
    private int idCongDan;
    private String tenCongDan;
    private String email;
    private String diaChi;

    public CongDan() {
    }

    public CongDan(int idCongDan, String tenCongDan, String email, String diaChi) {
        this.idCongDan = idCongDan;
        this.tenCongDan = tenCongDan;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getIdCongDan() {
        return idCongDan;
    }

    public void setIdCongDan(int idCongDan) {
        this.idCongDan = idCongDan;
    }

    public String getTenCongDan() {
        return tenCongDan;
    }

    public void setTenCongDan(String tenCongDan) {
        this.tenCongDan = tenCongDan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "CongDan{" +
                "idCongDan=" + idCongDan +
                ", tenCongDan='" + tenCongDan + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
     public String toStringCSV(){
        final String COMMA=",";
        return this.idCongDan+COMMA+this.tenCongDan+COMMA+this.email+COMMA+this.diaChi;
    }
}
