package Bai1.file.modol.repo;

import Bai1.file.modol.CongDan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repo implements IRepo {
    static List<CongDan> congDanList = new ArrayList<>();

    static {
        congDanList.add(new CongDan(1, "Văn Đồng", "fjbdfhai@gmail.com", "97Ngo GiaTu"));
        congDanList.add(new CongDan(2, "Văn Văn", "fjbdfhai@gmail.com", "98Ngo GiaTu"));
        congDanList.add(new CongDan(3, "Pew Pew", "fjbdfdsfhai@gmail.com", "100Ngo GiaTu"));
        congDanList.add(new CongDan(4, "Đồng Đồng", "fjbdfhai@gmail.com", "101Ngo GiaTu"));
    }

    @Override
    public void list() {
        for (int i = 0; i < congDanList.size(); i++) {
            System.out.println(congDanList.get(i));
        }
//        congDanList= IOCongDan.readfile();
    }

    @Override
    public void add(CongDan congDan) {
        congDanList.add(congDan);
//        IOCongDan.writer(congDanList);
    }

    @Override
    public CongDan findbyName(String congDan) {
        for (CongDan c : congDanList) {
            if (Objects.equals(c.getTenCongDan(), congDan)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void seach(CongDan congDan) {
        for (int i = 0; i <congDanList.size() ; i++) {
            if (Objects.equals(congDanList.get(i).getTenCongDan(), congDan.getTenCongDan())){
                System.out.println(congDanList.get(i));
            }
        }
    }
}
