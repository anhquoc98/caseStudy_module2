package Bai1.file.modol.repo;

import Bai1.file.modol.CongDan;

public interface IRepo {
    void list();
    void add(CongDan congDan);
    CongDan findbyName(String congDan);
    void seach(CongDan congDan);
}
