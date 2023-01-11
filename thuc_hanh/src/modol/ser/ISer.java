package modol.ser;

import modol.CongDan;

public interface ISer {
    void list();
    void add(CongDan congDan);
    CongDan findByName(String congDan);
    void seach(CongDan congDan);
}
