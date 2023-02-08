package Bai1.file.modol.ser;

import Bai1.file.modol.CongDan;
import Bai1.file.modol.repo.Repo;

public class Ser implements ISer {
    Repo repo = new Repo();

    @Override
    public void list() {
        repo.list();

    }

    @Override
    public void add(CongDan congDan) {
        repo.add(congDan);
    }

    @Override
    public CongDan findByName(String congDan) {
        repo.findbyName(congDan);
        return null;
    }

    @Override
    public void seach(CongDan congDan) {

    }
}
