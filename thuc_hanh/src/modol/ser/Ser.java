package modol.ser;

import modol.CongDan;
import modol.repo.Repo;

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
