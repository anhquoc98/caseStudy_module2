package Modol.Service;

import Modol.Repository.SoTietKiemRepo;
import Modol.SoTietKiem;

public class SoTietKiemSer implements ISever {
    SoTietKiemRepo soTietKiemRepo = new SoTietKiemRepo();

    @Override
    public void list() {
        soTietKiemRepo.list();
    }

    @Override
    public void add(SoTietKiem soTietKiem) {
        soTietKiemRepo.add(soTietKiem);
    }
}
