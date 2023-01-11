package Modol.Repository;

import Modol.SoTietKiem;
import Modol.data.IOSoTietKiem;

import java.util.ArrayList;
import java.util.List;

public class SoTietKiemRepo implements IRepo {
    static List<SoTietKiem> soTietKiemList = new ArrayList<>();

    @Override
    public void list() {

        for (SoTietKiem soTietKiem : soTietKiemList) {
            System.out.println(soTietKiem);
        }
        soTietKiemList = IOSoTietKiem.readfile();
    }

    @Override
    public void add(SoTietKiem soTietKiem) {
        soTietKiemList.add(soTietKiem);
        IOSoTietKiem.writeFile(soTietKiemList);
    }
}
