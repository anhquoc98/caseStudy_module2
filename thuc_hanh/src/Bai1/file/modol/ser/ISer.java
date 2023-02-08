package Bai1.file.modol.ser;

import Bai1.file.modol.CongDan;

public interface ISer {
    void list();
    void add(CongDan congDan);
    CongDan findByName(String congDan);
    void seach(CongDan congDan);
}
