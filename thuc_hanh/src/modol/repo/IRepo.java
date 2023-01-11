package modol.repo;

import modol.CongDan;

public interface IRepo {
    void list();
    void add(CongDan congDan);
    CongDan findbyName(String congDan);
    void seach(CongDan congDan);
}
